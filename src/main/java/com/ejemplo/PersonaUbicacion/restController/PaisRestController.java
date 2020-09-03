package com.ejemplo.PersonaUbicacion.restController;


import com.ejemplo.PersonaUbicacion.domain.Pais;
import com.ejemplo.PersonaUbicacion.domain.Provincia;
import com.ejemplo.PersonaUbicacion.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisRestController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> obtenerTodosLosPaises(){
        return paisService.obtenerPaises();
    }

    @GetMapping("/provinciasDePais/{paisId}")
    public List<Provincia> obtenerProvinciasDePaisId(@PathVariable Integer paisId){
        return paisService.obtenerProvinciasDePais(paisId);
    }

}
