package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.PserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/users")
@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	private PserDao pserDao;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	//增加一个用户
	@PostMapping("/add")
	public void  add(@RequestBody User user){
		userService.crate(user);
	}
	//通过用户名找用户
	@GetMapping("{username}")
	public User selectByUserName(@PathVariable String username){
		User user = userService.findByUserName(username);
		return userService.findByUserName(username);
	}
	@PostMapping("")
	public void d(@RequestBody Long q){

	}
	//根据部门id查用户列表
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("search/by/department")
	public List<User> selectByUnitId(Long id){
		return userService.selectByUnitId(id);
	}

	@GetMapping("id")
	public Long getId(Long idf){
		return userService.getId(idf);
	}
}