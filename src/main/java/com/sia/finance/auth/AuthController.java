package com.sia.finance.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/siarium")
public class AuthController {

	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("user") AuthUser user) {
		return "login";
	}
	
	@PostMapping("/login")
	public String Authentication(@ModelAttribute("user") AuthUser user) {
		return "greeting";
	}

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
}
