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
public class BudgetCtrlStrategyMpCondService extends BaseService<BudgetCtrlStrategyMpCondMapper,BudgetCtrlStrategyMpCond> {
    
    private final BudgetCtrlStrategyMpCondMapper budgetCtrlStrategyMpCondMapper;

    BudgetCtrlStrategyMpCondService(BudgetCtrlStrategyMpCondMapper budgetCtrlStrategyMpCondMapper){
        this.budgetCtrlStrategyMpCondMapper = budgetCtrlStrategyMpCondMapper;
    }

    public BudgetCtrlStrategyMpCond createBudgetCtrlStrategyMpCond(BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond){
        if (budgetCtrlStrategyMpCond.getId() != null) {
        throw new IdNotNullInCreateActionException();
        }
        try {
        budgetCtrlStrategyMpCond.setLastUpdatedDate(ZonedDateTime.now());
        budgetCtrlStrategyMpCond.setCreatedDate(ZonedDateTime.now());
        budgetCtrlStrategyMpCond.setIsEnabled(true);
        budgetCtrlStrategyMpCond.setIsDeleted(false);
        budgetCtrlStrategyMpCond.setLastUpdatedBy(100l);
        budgetCtrlStrategyMpCond.setVersionNumber(1l);
        budgetCtrlStrategyMpCond.setCreatedBy(100l);
        budgetCtrlStrategyMpCondMapper.insert(budgetCtrlStrategyMpCond);
        return budgetCtrlStrategyMpCond;
        } catch (DuplicateKeyException e) {
        throw new ValidationException(new ValidationError("code", "not.unique"));
        }
    }

    @Transactional
    public List<BudgetCtrlStrategyMpCond> createBudgetCtrlStrategyMpCondBatch(List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){
        for (BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond : budgetCtrlStrategyMpConds) {
        createBudgetCtrlStrategyMpCond(budgetCtrlStrategyMpCond);
        }
        return budgetCtrlStrategyMpConds;
    }

    public BudgetCtrlStrategyMpCond updateBudgetCtrlStrategyMpCond(BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond){
        if (budgetCtrlStrategyMpCond.getId() == null) {
        throw new ValidationException(new ValidationError("id", "id不能为空"));
        }
        budgetCtrlStrategyMpCondMapper.updateById(budgetCtrlStrategyMpCond);
        return budgetCtrlStrategyMpCond;
    }

    @Transactional
    public List<BudgetCtrlStrategyMpCond> updateBudgetCtrlStrategyMpCondBatch(List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){
        for (BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond : budgetCtrlStrategyMpConds) {
        updateBudgetCtrlStrategyMpCond(budgetCtrlStrategyMpCond);
        }
        return budgetCtrlStrategyMpConds;
    }

    public void deleteBudgetCtrlStrategyMpCond(Long id){

    }

    @Transactional
    public void deleteBudgetCtrlStrategyMpCondBatch(List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){

    }

    public List<BudgetCtrlStrategyMpCond> getBudgetCtrlStrategyMpCondByCond(
        Boolean isEnabled,
        int page,
        int size) {
        PageHelper.startPage(page, size);
        return budgetCtrlStrategyMpCondMapper.selectList(new EntityWrapper<BudgetCtrlStrategyMpCond>()
        .where("is_deleted = false")
        .eq(isEnabled != null, "is_enabled", isEnabled)
        .orderBy("id")
        );
    }
}
