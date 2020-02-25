package com.maudev.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		//para rutas propias del proyecto 
		return "forward:/app/index";

		// index por defecto
//		return "redirect:/app/index";

		// Tambien a una pagina
//		return "redirect:https://www.linkedin.com/in/maurisandev/";
	}
}
