package com.maudev.springboot.di.app.models.service;

//
//import org.springframework.stereotype.Component;


//@Component("miServicioComplejo")
////@Primary
public class MiServicioComplejo implements IServicio {
	

	@Override
	public String operacion() {
		return "Ejecutando algun proceso importante complejo..........";
	}

}

