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
@RequestMapping("/demo/cshBankAccount")
public class CshBankAccountController {

    private final CshBankAccountService cshBankAccountService;

    CshBankAccountController(CshBankAccountService cshBankAccountService){
        this.cshBankAccountService = cshBankAccountService;
    }

    @PostMapping()
    public ResponseEntity<CshBankAccount> createCshBankAccount(@RequestBody CshBankAccount cshBankAccount){
        return ResponseEntity.ok(cshBankAccountService.createCshBankAccount(cshBankAccount));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<CshBankAccount>> createCshBankAccountBatch(@RequestBody List<CshBankAccount> cshBankAccounts){
        return ResponseEntity.ok(cshBankAccountService.createCshBankAccountBatch(cshBankAccounts));
    }

    @PutMapping()
    public ResponseEntity<CshBankAccount> updateCshBankAccount(@RequestBody CshBankAccount cshBankAccount){
        return ResponseEntity.ok(cshBankAccountService.updateCshBankAccount(cshBankAccount));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<CshBankAccount>> updateCshBankAccountBatch(@RequestBody List<CshBankAccount> cshBankAccounts){
        return ResponseEntity.ok(cshBankAccountService.updateCshBankAccountBatch(cshBankAccounts));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCshBankAccount(@PathVariable Long id){
        cshBankAccountService.deleteCshBankAccount(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteCshBankAccountBatch(@RequestBody List<CshBankAccount> cshBankAccounts){
        cshBankAccountService.deleteCshBankAccountBatch(cshBankAccounts);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CshBankAccount> getCshBankAccountById(@PathVariable Long id) {
        return ResponseEntity.ok(cshBankAccountService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<CshBankAccount>> getCshBankAccountByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<CshBankAccount> list = cshBankAccountService.getCshBankAccountByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
