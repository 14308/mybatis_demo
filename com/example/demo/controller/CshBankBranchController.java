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
@RequestMapping("/demo/cshBankBranch")
public class CshBankBranchController {

    private final CshBankBranchService cshBankBranchService;

    CshBankBranchController(CshBankBranchService cshBankBranchService){
        this.cshBankBranchService = cshBankBranchService;
    }

    @PostMapping()
    public ResponseEntity<CshBankBranch> createCshBankBranch(@RequestBody CshBankBranch cshBankBranch){
        return ResponseEntity.ok(cshBankBranchService.createCshBankBranch(cshBankBranch));
    }

    @PostMapping("/batch")
    public ResponseEntity<List<CshBankBranch>> createCshBankBranchBatch(@RequestBody List<CshBankBranch> cshBankBranchs){
        return ResponseEntity.ok(cshBankBranchService.createCshBankBranchBatch(cshBankBranchs));
    }

    @PutMapping()
    public ResponseEntity<CshBankBranch> updateCshBankBranch(@RequestBody CshBankBranch cshBankBranch){
        return ResponseEntity.ok(cshBankBranchService.updateCshBankBranch(cshBankBranch));
    }

    @PutMapping("/batch")
    public ResponseEntity<List<CshBankBranch>> updateCshBankBranchBatch(@RequestBody List<CshBankBranch> cshBankBranchs){
        return ResponseEntity.ok(cshBankBranchService.updateCshBankBranchBatch(cshBankBranchs));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCshBankBranch(@PathVariable Long id){
        cshBankBranchService.deleteCshBankBranch(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/batch")
    public ResponseEntity deleteCshBankBranchBatch(@RequestBody List<CshBankBranch> cshBankBranchs){
        cshBankBranchService.deleteCshBankBranchBatch(cshBankBranchs);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CshBankBranch> getCshBankBranchById(@PathVariable Long id) {
        return ResponseEntity.ok(cshBankBranchService.selectById(id));
    }

  /*  @GetMapping("/query")
    public ResponseEntity<List<CshBankBranch>> getCshBankBranchByCond(
            @RequestParam(required = false) Boolean isEnabled,
            @RequestParam(defaultValue = PageUtil.DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = PageUtil.DEFAULT_SIZE) int size) throws URISyntaxException{
            List<CshBankBranch> list = cshBankBranchService.getCshBankBranchByCond(isEnabled,page,size);
        Page pages = PageUtil.getPage(PageHelper.getPagination(), list);
        HttpHeaders httpHeaders = PaginationUtil.generatePaginationHttpHeaders(pages, "/api/budget/coding/rule/objects/query");
        return new ResponseEntity(list, httpHeaders, HttpStatus.OK);
    }*/
}
