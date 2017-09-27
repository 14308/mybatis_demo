package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;
import com.cloudhelios.atlantis.budget.domain.*;
import com.cloudhelios.atlantis.budget.service.*;
import com.cloudhelios.atlantis.budget.utils.PageUtil;
import com.helioscloud.atlantis.util.PaginationUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.stereotype.Controller;

/**
 * @author dong.liu on 2017-09-05
 */
@RestController
@RequestMapping("/demo/budgetCtrlStrategyMpCond")
public class BudgetCtrlStrategyMpCondController {

    private final BudgetCtrlStrategyMpCondService budgetCtrlStrategyMpCondService;

    BudgetCtrlStrategyMpCondController(BudgetCtrlStrategyMpCondService budgetCtrlStrategyMpCondService){
        this.budgetCtrlStrategyMpCondService = budgetCtrlStrategyMpCondService;
    }

    @PostMapping()
    public ResponseEntity<BudgetCtrlStrategyMpCond> createBudgetCtrlStrategyMpCond(@RequestBody BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond){
        return ResponseEntity.ok(budgetCtrlStrategyMpCondService.createBudgetCtrlStrategyMpCond(budgetCtrlStrategyMpCond));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<BudgetCtrlStrategyMpCond>> createBudgetCtrlStrategyMpCondBatch(@RequestBody List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){
        return ResponseEntity.ok(budgetCtrlStrategyMpCondService.createBudgetCtrlStrategyMpCondBatch(budgetCtrlStrategyMpConds));
    }

    @PutMapping()
    public ResponseEntity<BudgetCtrlStrategyMpCond> updateBudgetCtrlStrategyMpCond(@RequestBody BudgetCtrlStrategyMpCond budgetCtrlStrategyMpCond){
        return ResponseEntity.ok(budgetCtrlStrategyMpCondService.updateBudgetCtrlStrategyMpCond(budgetCtrlStrategyMpCond));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<BudgetCtrlStrategyMpCond>> updateBudgetCtrlStrategyMpCondBatch(@RequestBody List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){
        return ResponseEntity.ok(budgetCtrlStrategyMpCondService.updateBudgetCtrlStrategyMpCondBatch(budgetCtrlStrategyMpConds));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBudgetCtrlStrategyMpCond(@PathVariable Long id){
        budgetCtrlStrategyMpCondService.deleteBudgetCtrlStrategyMpCond(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteBudgetCtrlStrategyMpCondBatch(@RequestBody List<BudgetCtrlStrategyMpCond> budgetCtrlStrategyMpConds){
        budgetCtrlStrategyMpCondService.deleteBudgetCtrlStrategyMpCondBatch(budgetCtrlStrategyMpConds);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BudgetCtrlStrategyMpCond> getBudgetCtrlStrategyMpCondById(@PathVariable Long id) {
        return ResponseEntity.ok(budgetCtrlStrategyMpCondService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<BudgetCtrlStrategyMpCond>> getBudgetCtrlStrategyMpCondByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<BudgetCtrlStrategyMpCond> list = budgetCtrlStrategyMpCondService.getBudgetCtrlStrategyMpCondByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
