package com.interfac.springdemo.common.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.interfac.springdemo.util.LoginValidator;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap model) {
		if (LoginValidator.validateUser(username, password)) {
			model.put("errorMessage", "invalid credentials!");
			return "login";
		}
			//model.put("username", username);
			model.put("welcomeMessage", "You are logged in as '" + username + "' ");
			return "HomePage";
	}
}
