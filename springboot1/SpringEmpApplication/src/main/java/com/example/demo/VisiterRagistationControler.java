package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class VisiterRagistationControler {

	private Visiter VisiterService.java;

	public VisiterRagistationControler(VisiterService visiService) {
		super();
		this.visiterService = visiService;
	}
	
	@ModelAttribute("user")
    public VisiterRagistationControler VisiterRagistation() {
        return new VisiterRagistationControler(null);
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerVisiterAccount(@ModelAttribute("user") VisiterRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
}
