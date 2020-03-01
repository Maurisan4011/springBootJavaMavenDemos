package com.maudev.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maudev.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	@Autowired
	//Tambien se puede Usar
	//@Qualifier("miServicioComplejo")
	private IServicio servicio;
	
//	con metodo
//	@Autowired
//	public IndexController(IServicio servicio) {
//	
//		this.servicio = servicio;
//	}
	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {

		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
//con setter
//	@Autowired
//	public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
//	}

}
