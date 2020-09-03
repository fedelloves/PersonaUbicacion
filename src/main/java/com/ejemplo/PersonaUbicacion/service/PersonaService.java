package com.ejemplo.PersonaUbicacion.service;

import com.ejemplo.PersonaUbicacion.domain.Persona;
import com.ejemplo.PersonaUbicacion.domain.Telefono;
import com.ejemplo.PersonaUbicacion.dto.PersonaDTO;
import com.ejemplo.PersonaUbicacion.dto.TelefonoDTO;
import com.ejemplo.PersonaUbicacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<PersonaDTO> obtenerPersonas(){
        List<Persona> personas = personaRepository.findAll();
        List<PersonaDTO> personasDTO = new ArrayList<>();

        for(Persona persona: personas){
            PersonaDTO nuevaPersona = new PersonaDTO(persona);
            Set<TelefonoDTO> nuevosTelefonos = new HashSet<>();

            for(Telefono tel: persona.getTelefonos()){
                TelefonoDTO nuevoTelefono = new TelefonoDTO(tel);
                nuevosTelefonos.add(nuevoTelefono);
            }

            nuevaPersona.setTelefonos(nuevosTelefonos);

            personasDTO.add(nuevaPersona);
        }

        return personasDTO;

    }

    public void guardarPersona(Persona persona){
        for(Telefono tel: persona.getTelefonos()){
            tel.setPersona(persona);
        }
        this.personaRepository.save(persona);
    }

    public void eliminarPersona(Persona persona){
        this.personaRepository.delete(persona);
    }

    public Persona obtenerPersonaPorId(Integer idPersona){
        return personaRepository.findById(idPersona).orElse(null);
    }


}
