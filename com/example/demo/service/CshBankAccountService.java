package

    com.example.demo.service;

import com.cloudhelios.atlantis.budget.domain.*;
import com.cloudhelios.atlantis.budget.persistence.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.helioscloud.atlantis.exception.core.IdNotNullInCreateActionException;
import com.helioscloud.atlantis.exception.core.ValidationError;
import com.helioscloud.atlantis.exception.core.ValidationException;
import com.helioscloud.atlantis.service.BaseService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author dong.liu on 2017-09-05
 */
@Service
public class CshBankAccountService extends BaseService<CshBankAccountMapper,CshBankAccount> {
    
    private final CshBankAccountMapper cshBankAccountMapper;

    CshBankAccountService(CshBankAccountMapper cshBankAccountMapper){
        this.cshBankAccountMapper = cshBankAccountMapper;
    }

    public CshBankAccount createCshBankAccount(CshBankAccount cshBankAccount){
        if (cshBankAccount.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        cshBankAccount.setLastUpdatedDate(ZonedDateTime.now());
        cshBankAccount.setCreatedDate(ZonedDateTime.now());
        cshBankAccount.setIsEnabled(true);
        cshBankAccount.setIsDeleted(false);
        cshBankAccount.setLastUpdatedBy(100l);
        cshBankAccount.setVersionNumber(1l);
        cshBankAccount.setCreatedBy(100l);
        cshBankAccountMapper.insert(cshBankAccount);
        return cshBankAccount;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<CshBankAccount> createCshBankAccountBatch(List<CshBankAccount> cshBankAccounts){
        for (CshBankAccount cshBankAccount : cshBankAccounts) {
        createCshBankAccount(cshBankAccount);
        }
        return cshBankAccounts;
    }

    public CshBankAccount updateCshBankAccount(CshBankAccount cshBankAccount){
        if (cshBankAccount.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        cshBankAccountMapper.updateById(cshBankAccount);
        return cshBankAccount;
    }

    @Transactional
    public List<CshBankAccount> updateCshBankAccountBatch(List<CshBankAccount> cshBankAccounts){
        for (CshBankAccount cshBankAccount : cshBankAccounts) {
        updateCshBankAccount(cshBankAccount);
        }
        return cshBankAccounts;
    }

    public void deleteCshBankAccount(Long id){

    }

    @Transactional
    public void deleteCshBankAccountBatch(List<CshBankAccount> cshBankAccounts){

    }

    public List<CshBankAccount> getCshBankAccountByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return cshBankAccountMapper.selectList(new EntityWrapper<CshBankAccount>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
