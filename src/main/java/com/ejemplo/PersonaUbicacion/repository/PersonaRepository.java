package com.ejemplo.PersonaUbicacion.repository;

import com.ejemplo.PersonaUbicacion.domain.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    @Override
    List<Persona> findAll();

}
