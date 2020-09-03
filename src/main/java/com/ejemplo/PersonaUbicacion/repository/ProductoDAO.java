package com.ejemplo.PersonaUbicacion.repository;

import com.ejemplo.PersonaUbicacion.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<Producto, Integer> {
}
