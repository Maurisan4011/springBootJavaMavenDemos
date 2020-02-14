package com.maudev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maudev.model.Persona;
import com.maudev.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //logica 
		
		Persona m = new Persona();
		m.setIdPersona(5);
		m.setNombre("reserv");
		repo.save(m);
		
		model.addAttribute("name", name);
        return "greeting";
    }
	
	@GetMapping("/listar")
    public String greeting(Model model) {
        //logica 							
		model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
}