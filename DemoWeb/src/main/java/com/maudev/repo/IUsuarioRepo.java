package com.maudev.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.maudev.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	Usuario findByNombre(String nombre);
	
}
