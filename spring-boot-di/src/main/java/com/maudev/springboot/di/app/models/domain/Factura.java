package com.maudev.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

@Component
//para que sea request
@RequestScope
//Para marcar el objeto de sesion
//@SessionScope
//singleton que se guarda en el servlet contaxt 
//@ApplicationScope
public class Factura implements Serializable {

	/**
	 * es un atributo estatico que lo maneja como sesion 
	 * 
	 */
	private static final long serialVersionUID = -787407605292457950L;

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired

	private Cliente cliente;

	@Autowired

	private List<ItemFactura> items;

	@PostConstruct
	public void init() {
		cliente.setNombre(cliente.getNombre().concat("Oscar"));
		descripcion = descripcion.concat(" del cliente ").concat(cliente.getNombre());
	}

	@PreDestroy
	public void destruir() {

		System.out.println("Factura destruida:  ".concat(descripcion));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
