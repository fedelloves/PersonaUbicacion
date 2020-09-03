package com.ejemplo.PersonaUbicacion;

import com.ejemplo.PersonaUbicacion.domain.*;
import com.ejemplo.PersonaUbicacion.service.PaisService;
import com.ejemplo.PersonaUbicacion.service.PersonaService;
import com.ejemplo.PersonaUbicacion.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class PersonaUbicacionApplication implements CommandLineRunner {

	@Autowired
	PersonaService personaService;
	@Autowired
	PaisService paisService;
	@Autowired
	ProvinciaService provinciaService;



	public static void main(String[] args) {

		SpringApplication.run(PersonaUbicacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//List<Persona> personas = personaService.obtenerPersonas();

		//System.out.println(personas);

		/*
		Persona p1 = new Persona();
		p1.setApellido("Eliminado");
		p1.setNombre("Usuario");
		p1.setEdad(20);

		Telefono tel = new Telefono();
		tel.setTipo("Cel");
		tel.setNumero(1174536622);
		Set<Telefono> telefonos = new HashSet<>();
		telefonos.add(tel);

		Domicilio domicilio = new Domicilio();
		domicilio.setNumero(123);
		domicilio.setCalle("Av. Siempre Viva");
		Set<Domicilio> domicilios = new HashSet<>();
		domicilios.add(domicilio);

		p1.setTelefonos(telefonos);
		p1.setDomicilios(domicilios);

		personaService.guardarPersona(p1);

		*/


		Persona persona = personaService.obtenerPersonaPorId(5);

		System.out.println(persona);

		personaService.eliminarPersona(persona);



	}

}
