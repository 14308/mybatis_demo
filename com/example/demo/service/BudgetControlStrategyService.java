package com.example.demo.service;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import org.springframework.stereotype.Service;

/**
 * @author dong.liu on 2017-08-22
 */
@Service
public class BudgetControlStrategyService extends BaseService<BudgetControlStrategyMapper,BudgetControlStrategy> {
    private final BudgetControlStrategyMapper budgetcontrolstrategymapper;

    BudgetControlStrategyController(BudgetControlStrategyMapper budgetcontrolstrategymapper){
        this.budgetcontrolstrategymapper = budgetcontrolstrategymapper;
    }
}
