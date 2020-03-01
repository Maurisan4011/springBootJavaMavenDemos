package com.maudev.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.maudev.springboot.di.app.models.domain.ItemFactura;
import com.maudev.springboot.di.app.models.domain.Producto;
import com.maudev.springboot.di.app.models.service.IServicio;
import com.maudev.springboot.di.app.models.service.MiServicio;
import com.maudev.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Primary
	@Bean("MiServicioSiemple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("MiServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Calular motorola", 250);
		Producto producto3 = new Producto("mouse logutech", 1150);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 5);
		ItemFactura linea3 = new ItemFactura(producto3, 9);
	return Arrays.asList(linea1,linea2,linea3);
	}
	
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("escritorop", 2100);
		Producto producto2 = new Producto("impresora multifuncion", 56250);
		Producto producto3 = new Producto("notebook", 1150);
		Producto producto4 = new Producto("Sillon", 56465);
		
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 5);
		ItemFactura linea3 = new ItemFactura(producto3, 9);
		ItemFactura linea4 = new ItemFactura(producto4, 5);
	return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
