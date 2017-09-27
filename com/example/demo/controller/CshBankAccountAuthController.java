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
@RequestMapping("/demo/cshBankAccountAuth")
public class CshBankAccountAuthController {

    private final CshBankAccountAuthService cshBankAccountAuthService;

    CshBankAccountAuthController(CshBankAccountAuthService cshBankAccountAuthService){
        this.cshBankAccountAuthService = cshBankAccountAuthService;
    }

    @PostMapping()
    public ResponseEntity<CshBankAccountAuth> createCshBankAccountAuth(@RequestBody CshBankAccountAuth cshBankAccountAuth){
        return ResponseEntity.ok(cshBankAccountAuthService.createCshBankAccountAuth(cshBankAccountAuth));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<CshBankAccountAuth>> createCshBankAccountAuthBatch(@RequestBody List<CshBankAccountAuth> cshBankAccountAuths){
        return ResponseEntity.ok(cshBankAccountAuthService.createCshBankAccountAuthBatch(cshBankAccountAuths));
    }

    @PutMapping()
    public ResponseEntity<CshBankAccountAuth> updateCshBankAccountAuth(@RequestBody CshBankAccountAuth cshBankAccountAuth){
        return ResponseEntity.ok(cshBankAccountAuthService.updateCshBankAccountAuth(cshBankAccountAuth));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<CshBankAccountAuth>> updateCshBankAccountAuthBatch(@RequestBody List<CshBankAccountAuth> cshBankAccountAuths){
        return ResponseEntity.ok(cshBankAccountAuthService.updateCshBankAccountAuthBatch(cshBankAccountAuths));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCshBankAccountAuth(@PathVariable Long id){
        cshBankAccountAuthService.deleteCshBankAccountAuth(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteCshBankAccountAuthBatch(@RequestBody List<CshBankAccountAuth> cshBankAccountAuths){
        cshBankAccountAuthService.deleteCshBankAccountAuthBatch(cshBankAccountAuths);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CshBankAccountAuth> getCshBankAccountAuthById(@PathVariable Long id) {
        return ResponseEntity.ok(cshBankAccountAuthService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<CshBankAccountAuth>> getCshBankAccountAuthByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<CshBankAccountAuth> list = cshBankAccountAuthService.getCshBankAccountAuthByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
