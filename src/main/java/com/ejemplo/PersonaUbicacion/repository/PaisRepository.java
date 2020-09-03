package com.ejemplo.PersonaUbicacion.repository;

import com.ejemplo.PersonaUbicacion.domain.Pais;
import com.ejemplo.PersonaUbicacion.domain.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Integer>{

    @Override
    List<Pais> findAll();

    @Query("SELECT pr FROM Pais pa JOIN pa.provincias pr WHERE pa.idPais = ?1")
    public List<Provincia> obtenerProvinciasDePais(Integer idPais);




}
