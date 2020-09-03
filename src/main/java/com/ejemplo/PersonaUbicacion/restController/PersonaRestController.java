package com.ejemplo.PersonaUbicacion.restController;

import com.ejemplo.PersonaUbicacion.domain.Persona;
import com.ejemplo.PersonaUbicacion.dto.PersonaDTO;
import com.ejemplo.PersonaUbicacion.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/personas")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<PersonaDTO> obtenerTodasLasPersonas(){
        return personaService.obtenerPersonas();
    }

}
