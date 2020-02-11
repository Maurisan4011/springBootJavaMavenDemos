package com.maudev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maudev.service.IPersonaService;
import com.maudev.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Hola papus desde Spring Boot");
//		LOG.info("Hola papus desde Spring Boot");
//		LOG.warn("Error advirtiendo a los coders!!!!");
		
		service.registrar("MAuriDev");
	}

}
