package com.maudev.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maudev.h2.modelo.Persona;

@Repository
public class PersonaDao implements IPersona {

	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Persona> listar() {
		String sql = "select * from persona";

		List<Persona> personas = template.query(sql, new BeanPropertyRowMapper<Persona>(Persona.class));
		return personas;
	}

	@Override
	public Persona listPersonaId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editar(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
