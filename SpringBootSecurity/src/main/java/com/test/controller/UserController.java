package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableMethodSecurity
public class UserController {
	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	@GetMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	@GetMapping("/user/read")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
	public String userPage()
	{
		return "USER AND ADMIN CAN READ THE DATA";
	}
	@GetMapping("/delete")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	public String adminPage() {
		return "ONLY ADMIN CAN DELETE THE DATA";
	}
	@GetMapping("/update")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	
	public String updateUsers()
	{
		return "Details Updated with ADMIN role";
	}
	@GetMapping("user/hr/onboard")
	@ResponseBody
	@PreAuthorize("hasAnyRole('ROLE_HR','ROLE_EMPLOYEE')")
	
	public String updateHr()
	{
		return "Details scheduled with HR role";
	}
	
}
