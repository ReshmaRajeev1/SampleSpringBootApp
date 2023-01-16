package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMethod(@RequestParam("name") String name, Model model) {
		model.addAttribute("msg", "hi  " + name);
		return "welcome";

	}

	@GetMapping("/greet/{name}")
	public String greetMethod(@PathVariable("name") String name, Model model) {
		model.addAttribute("msg", "hi  " + name);
		return "welcome";

	}

}