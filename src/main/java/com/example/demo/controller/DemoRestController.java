package com.example.demo.controller;

import com.example.demo.util.SecurityUtils;
import org.springframework.cache.annotation.CachePut;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class DemoRestController {
    @GetMapping("/hello")
    @PreAuthorize("hasRole('ADMIN')")
    public String greeting() {
        return "Hello " + SecurityUtils.getCurrentUser();
    }


    @GetMapping("/public/api")
    public String publicAPI() {
        return "this is public API";
    }
}