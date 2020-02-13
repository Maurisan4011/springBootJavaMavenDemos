package com.maudev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maudev.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
}
