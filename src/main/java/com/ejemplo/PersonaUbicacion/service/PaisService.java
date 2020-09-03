package com.ejemplo.PersonaUbicacion.service;

import com.ejemplo.PersonaUbicacion.domain.Pais;
import com.ejemplo.PersonaUbicacion.domain.Provincia;
import com.ejemplo.PersonaUbicacion.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    PaisRepository repository;

    public List<Pais> obtenerPaises(){
        return repository.findAll();
    }

    public Pais obtenerPaisPorId(Integer id){
        return repository.findById(id).orElse(null);
    }

    public List<Provincia> obtenerProvinciasDePais(Integer idPais){
        return repository.obtenerProvinciasDePais(idPais);
    }






}
