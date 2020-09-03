package com.ejemplo.PersonaUbicacion.service;

import com.ejemplo.PersonaUbicacion.domain.Provincia;
import com.ejemplo.PersonaUbicacion.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProvinciaService {

    @Autowired
    ProvinciaRepository provinciaRepository;

    public List<Provincia> obtenerProvincias(){
        return provinciaRepository.findAll();
    }

    public Provincia obtenerProvinciaPorId(Integer idProvincia){
        return provinciaRepository.findById(idProvincia).orElse(null);
    }

}
