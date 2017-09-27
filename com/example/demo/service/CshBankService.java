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
public class CshBankService extends BaseService<CshBankMapper,CshBank> {
    
    private final CshBankMapper cshBankMapper;

    CshBankService(CshBankMapper cshBankMapper){
        this.cshBankMapper = cshBankMapper;
    }

    public CshBank createCshBank(CshBank cshBank){
        if (cshBank.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        cshBank.setLastUpdatedDate(ZonedDateTime.now());
        cshBank.setCreatedDate(ZonedDateTime.now());
        cshBank.setIsEnabled(true);
        cshBank.setIsDeleted(false);
        cshBank.setLastUpdatedBy(100l);
        cshBank.setVersionNumber(1l);
        cshBank.setCreatedBy(100l);
        cshBankMapper.insert(cshBank);
        return cshBank;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<CshBank> createCshBankBatch(List<CshBank> cshBanks){
        for (CshBank cshBank : cshBanks) {
        createCshBank(cshBank);
        }
        return cshBanks;
    }

    public CshBank updateCshBank(CshBank cshBank){
        if (cshBank.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        cshBankMapper.updateById(cshBank);
        return cshBank;
    }

    @Transactional
    public List<CshBank> updateCshBankBatch(List<CshBank> cshBanks){
        for (CshBank cshBank : cshBanks) {
        updateCshBank(cshBank);
        }
        return cshBanks;
    }

    public void deleteCshBank(Long id){

    }

    @Transactional
    public void deleteCshBankBatch(List<CshBank> cshBanks){

    }

    public List<CshBank> getCshBankByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return cshBankMapper.selectList(new EntityWrapper<CshBank>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
