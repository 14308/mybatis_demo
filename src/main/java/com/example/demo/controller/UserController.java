package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/users")
@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	//增加一个用户
	@PostMapping("/add")
	public void  add(User user){
		System.out.println(user);
		userService.insert(user);
	}
	@PostMapping("")
	public void d(@RequestBody Long q){
		System.out.println(q);
	}
	//根据部门id查用户列表
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("search/by/department")
	public List<User> selectByUnitId(Long id){
		return userService.selectByUnitId(id);
	}
}