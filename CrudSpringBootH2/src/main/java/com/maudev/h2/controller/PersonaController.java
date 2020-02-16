package com.maudev.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maudev.h2.service.IPersonaService;

@Controller
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		service.listar();
		model.addAttribute("personas", service.listar());
		return "index";
	}
}
