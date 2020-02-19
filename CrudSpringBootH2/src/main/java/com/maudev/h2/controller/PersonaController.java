package com.maudev.h2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.maudev.h2.modelo.Persona;
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

	@GetMapping("/nuevo")
	public String nuevo() {
		return "agregar";

	}

	@PostMapping("/agregar")
	public String agregar(@Valid Persona p) {
		service.agregar(p);
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Persona persona = service.listPersonaId(id);
		model.addAttribute("persona", persona);
		return "editar";
	}

	@PostMapping("/actualizar")
	public String actualizar(@Valid Persona p) {
		service.editar(p);
		return "redirect:/listar";
	}

	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
}
