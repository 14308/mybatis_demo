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
@RequestMapping("/demo/budgetVersionAssignCompany")
public class BudgetVersionAssignCompanyController {

    private final BudgetVersionAssignCompanyService budgetVersionAssignCompanyService;

    BudgetVersionAssignCompanyController(BudgetVersionAssignCompanyService budgetVersionAssignCompanyService){
        this.budgetVersionAssignCompanyService = budgetVersionAssignCompanyService;
    }

    @PostMapping()
    public ResponseEntity<BudgetVersionAssignCompany> createBudgetVersionAssignCompany(@RequestBody BudgetVersionAssignCompany budgetVersionAssignCompany){
        return ResponseEntity.ok(budgetVersionAssignCompanyService.createBudgetVersionAssignCompany(budgetVersionAssignCompany));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<BudgetVersionAssignCompany>> createBudgetVersionAssignCompanyBatch(@RequestBody List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){
        return ResponseEntity.ok(budgetVersionAssignCompanyService.createBudgetVersionAssignCompanyBatch(budgetVersionAssignCompanys));
    }

    @PutMapping()
    public ResponseEntity<BudgetVersionAssignCompany> updateBudgetVersionAssignCompany(@RequestBody BudgetVersionAssignCompany budgetVersionAssignCompany){
        return ResponseEntity.ok(budgetVersionAssignCompanyService.updateBudgetVersionAssignCompany(budgetVersionAssignCompany));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<BudgetVersionAssignCompany>> updateBudgetVersionAssignCompanyBatch(@RequestBody List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){
        return ResponseEntity.ok(budgetVersionAssignCompanyService.updateBudgetVersionAssignCompanyBatch(budgetVersionAssignCompanys));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBudgetVersionAssignCompany(@PathVariable Long id){
        budgetVersionAssignCompanyService.deleteBudgetVersionAssignCompany(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteBudgetVersionAssignCompanyBatch(@RequestBody List<BudgetVersionAssignCompany> budgetVersionAssignCompanys){
        budgetVersionAssignCompanyService.deleteBudgetVersionAssignCompanyBatch(budgetVersionAssignCompanys);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BudgetVersionAssignCompany> getBudgetVersionAssignCompanyById(@PathVariable Long id) {
        return ResponseEntity.ok(budgetVersionAssignCompanyService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<BudgetVersionAssignCompany>> getBudgetVersionAssignCompanyByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<BudgetVersionAssignCompany> list = budgetVersionAssignCompanyService.getBudgetVersionAssignCompanyByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
