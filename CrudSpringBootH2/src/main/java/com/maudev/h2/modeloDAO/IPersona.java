package com.maudev.h2.modeloDAO;

import java.util.List;

import com.maudev.h2.modelo.Persona;

public interface IPersona {

	public List<Persona> listar();

	public Persona listPersonaId(int id);

	public int agregar(Persona p);

	public int editar(Persona p);

	public void delete(int id);

}
