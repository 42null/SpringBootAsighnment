package com.example.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}

	@GetMapping("/aboutMe")
	public String visitAboutMe(){
		return "/pages/aboutMe";
	}

	@GetMapping("/contact")
	public String visitContact(){
		return "/pages/contact";
	}

	@GetMapping("/platforms")
	public String visitPlatforms(){
		return "/pages/platforms";
	}

//	@RequestMapping("/search")
//	public String search(){
//		return "redirect:http://www.google.com";
//	}

}