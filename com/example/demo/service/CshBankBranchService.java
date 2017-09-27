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
public class CshBankBranchService extends BaseService<CshBankBranchMapper,CshBankBranch> {
    
    private final CshBankBranchMapper cshBankBranchMapper;

    CshBankBranchService(CshBankBranchMapper cshBankBranchMapper){
        this.cshBankBranchMapper = cshBankBranchMapper;
    }

    public CshBankBranch createCshBankBranch(CshBankBranch cshBankBranch){
        if (cshBankBranch.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        cshBankBranch.setLastUpdatedDate(ZonedDateTime.now());
        cshBankBranch.setCreatedDate(ZonedDateTime.now());
        cshBankBranch.setIsEnabled(true);
        cshBankBranch.setIsDeleted(false);
        cshBankBranch.setLastUpdatedBy(100l);
        cshBankBranch.setVersionNumber(1l);
        cshBankBranch.setCreatedBy(100l);
        cshBankBranchMapper.insert(cshBankBranch);
        return cshBankBranch;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<CshBankBranch> createCshBankBranchBatch(List<CshBankBranch> cshBankBranchs){
        for (CshBankBranch cshBankBranch : cshBankBranchs) {
        createCshBankBranch(cshBankBranch);
        }
        return cshBankBranchs;
    }

    public CshBankBranch updateCshBankBranch(CshBankBranch cshBankBranch){
        if (cshBankBranch.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        cshBankBranchMapper.updateById(cshBankBranch);
        return cshBankBranch;
    }

    @Transactional
    public List<CshBankBranch> updateCshBankBranchBatch(List<CshBankBranch> cshBankBranchs){
        for (CshBankBranch cshBankBranch : cshBankBranchs) {
        updateCshBankBranch(cshBankBranch);
        }
        return cshBankBranchs;
    }

    public void deleteCshBankBranch(Long id){

    }

    @Transactional
    public void deleteCshBankBranchBatch(List<CshBankBranch> cshBankBranchs){

    }

    public List<CshBankBranch> getCshBankBranchByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return cshBankBranchMapper.selectList(new EntityWrapper<CshBankBranch>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
