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
public class BudgetVersionAssignCompanyService extends BaseService<BudgetVersionAssignCompanyMapper,BudgetVersionAssignCompany> {
    
    private final BudgetVersionAssignCompanyMapper budgetVersionAssignCompanyMapper;

    BudgetVersionAssignCompanyService(BudgetVersionAssignCompanyMapper budgetVersionAssignCompanyMapper){
        this.budgetVersionAssignCompanyMapper = budgetVersionAssignCompanyMapper;
    }

    public BudgetVersionAssignCompany createBudgetVersionAssignCompany(BudgetVersionAssignCompany budgetVersionAssignCompany){
        if (budgetVersionAssignCompany.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        budgetVersionAssignCompany.setLastUpdatedDate(ZonedDateTime.now());
        budgetVersionAssignCompany.setCreatedDate(ZonedDateTime.now());
        budgetVersionAssignCompany.setIsEnabled(true);
        budgetVersionAssignCompany.setIsDeleted(false);
        budgetVersionAssignCompany.setLastUpdatedBy(100l);
        budgetVersionAssignCompany.setVersionNumber(1l);
        budgetVersionAssignCompany.setCreatedBy(100l);
        budgetVersionAssignCompanyMapper.insert(budgetVersionAssignCompany);
        return budgetVersionAssignCompany;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<BudgetVersionAssignCompany> createBudgetVersionAssignCompanyBatch(List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){
        for (BudgetVersionAssignCompany budgetVersionAssignCompany : budgetVersionAssignCompanys) {
        createBudgetVersionAssignCompany(budgetVersionAssignCompany);
        }
        return budgetVersionAssignCompanys;
    }

    public BudgetVersionAssignCompany updateBudgetVersionAssignCompany(BudgetVersionAssignCompany budgetVersionAssignCompany){
        if (budgetVersionAssignCompany.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        budgetVersionAssignCompanyMapper.updateById(budgetVersionAssignCompany);
        return budgetVersionAssignCompany;
    }

    @Transactional
    public List<BudgetVersionAssignCompany> updateBudgetVersionAssignCompanyBatch(List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){
        for (BudgetVersionAssignCompany budgetVersionAssignCompany : budgetVersionAssignCompanys) {
        updateBudgetVersionAssignCompany(budgetVersionAssignCompany);
        }
        return budgetVersionAssignCompanys;
    }

    public void deleteBudgetVersionAssignCompany(Long id){

    }

    @Transactional
    public void deleteBudgetVersionAssignCompanyBatch(List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){

    }

    public List<BudgetVersionAssignCompany> getBudgetVersionAssignCompanyByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return budgetVersionAssignCompanyMapper.selectList(new EntityWrapper<BudgetVersionAssignCompany>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
