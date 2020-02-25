package com.maudev.springboot.web.app.controllers;


import java.util.Arrays;
import java.util.List;





import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maudev.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
   @Value("${texto.indexcontroller.index.titulo}")
	private String  textoIndex;
   
   @Value("${texto.indexcontroller.perfil.titulo}")
	private String  textoPerfil;
   
   @Value("${texto.indexcontroller.listar.titulo}")
	private String  textoLisitar;
	
   
	@GetMapping({ "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo" , textoIndex);
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Mauricio");
		usuario.setApellido("Sanchez");
		usuario.setEmail("Maurisan4011@gmail.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));

		return "perfil";

	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", textoLisitar );

		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> llenarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Mauricio", "Sanchez", "mauri@mauri.com"),
				new Usuario("1Mauricio", "1Sanchez", "1mauri@mauri.com"),
				new Usuario("2Mauricio", "2Sanchez", "2mauri@mauri.com"),
				new Usuario("3Mauricio", "3Sanchez", "3mauri@mauri.com"),
				new Usuario("4Mauricio", "3Sanchez", "3mauri@mauri.com"));

		return usuarios;

	}

}
