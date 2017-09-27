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
@RequestMapping("/demo/cshBank")
public class CshBankController {

    private final CshBankService cshBankService;

    CshBankController(CshBankService cshBankService){
        this.cshBankService = cshBankService;
    }

    @PostMapping()
    public ResponseEntity<CshBank> createCshBank(@RequestBody CshBank cshBank){
        return ResponseEntity.ok(cshBankService.createCshBank(cshBank));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<CshBank>> createCshBankBatch(@RequestBody List<CshBank> cshBanks){
        return ResponseEntity.ok(cshBankService.createCshBankBatch(cshBanks));
    }

    @PutMapping()
    public ResponseEntity<CshBank> updateCshBank(@RequestBody CshBank cshBank){
        return ResponseEntity.ok(cshBankService.updateCshBank(cshBank));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<CshBank>> updateCshBankBatch(@RequestBody List<CshBank> cshBanks){
        return ResponseEntity.ok(cshBankService.updateCshBankBatch(cshBanks));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCshBank(@PathVariable Long id){
        cshBankService.deleteCshBank(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteCshBankBatch(@RequestBody List<CshBank> cshBanks){
        cshBankService.deleteCshBankBatch(cshBanks);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CshBank> getCshBankById(@PathVariable Long id) {
        return ResponseEntity.ok(cshBankService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<CshBank>> getCshBankByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<CshBank> list = cshBankService.getCshBankByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
