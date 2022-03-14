package com.ctsflightapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ctsflightapp.demo.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	

}
