package com.ejemplo.PersonaUbicacion.repository;

import com.ejemplo.PersonaUbicacion.domain.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia, Integer> {

    @Override
    List<Provincia> findAll();


}
