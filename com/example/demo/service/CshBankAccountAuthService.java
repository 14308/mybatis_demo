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
public class CshBankAccountAuthService extends BaseService<CshBankAccountAuthMapper,CshBankAccountAuth> {
    
    private final CshBankAccountAuthMapper cshBankAccountAuthMapper;

    CshBankAccountAuthService(CshBankAccountAuthMapper cshBankAccountAuthMapper){
        this.cshBankAccountAuthMapper = cshBankAccountAuthMapper;
    }

    public CshBankAccountAuth createCshBankAccountAuth(CshBankAccountAuth cshBankAccountAuth){
        if (cshBankAccountAuth.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        cshBankAccountAuth.setLastUpdatedDate(ZonedDateTime.now());
        cshBankAccountAuth.setCreatedDate(ZonedDateTime.now());
        cshBankAccountAuth.setIsEnabled(true);
        cshBankAccountAuth.setIsDeleted(false);
        cshBankAccountAuth.setLastUpdatedBy(100l);
        cshBankAccountAuth.setVersionNumber(1l);
        cshBankAccountAuth.setCreatedBy(100l);
        cshBankAccountAuthMapper.insert(cshBankAccountAuth);
        return cshBankAccountAuth;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<CshBankAccountAuth> createCshBankAccountAuthBatch(List<CshBankAccountAuth> cshBankAccountAuths){
        for (CshBankAccountAuth cshBankAccountAuth : cshBankAccountAuths) {
        createCshBankAccountAuth(cshBankAccountAuth);
        }
        return cshBankAccountAuths;
    }

    public CshBankAccountAuth updateCshBankAccountAuth(CshBankAccountAuth cshBankAccountAuth){
        if (cshBankAccountAuth.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        cshBankAccountAuthMapper.updateById(cshBankAccountAuth);
        return cshBankAccountAuth;
    }

    @Transactional
    public List<CshBankAccountAuth> updateCshBankAccountAuthBatch(List<CshBankAccountAuth> cshBankAccountAuths){
        for (CshBankAccountAuth cshBankAccountAuth : cshBankAccountAuths) {
        updateCshBankAccountAuth(cshBankAccountAuth);
        }
        return cshBankAccountAuths;
    }

    public void deleteCshBankAccountAuth(Long id){

    }

    @Transactional
    public void deleteCshBankAccountAuthBatch(List<CshBankAccountAuth> cshBankAccountAuths){

    }

    public List<CshBankAccountAuth> getCshBankAccountAuthByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return cshBankAccountAuthMapper.selectList(new EntityWrapper<CshBankAccountAuth>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
