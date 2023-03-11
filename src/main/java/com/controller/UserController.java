package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.UserRepository;
import com.entity.UserEntity;
@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/signup")
	public String signup() {
		return "Signup";
	}

	@PostMapping("/saveuser")
	public String saveUser(UserEntity user) {
		userRepo.save(user);
		System.out.println(user.getUserId());
		return "Signup";
	}
}
