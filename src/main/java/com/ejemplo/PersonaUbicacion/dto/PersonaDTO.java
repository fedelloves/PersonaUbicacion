package com.ejemplo.PersonaUbicacion.dto;

import com.ejemplo.PersonaUbicacion.domain.Domicilio;
import com.ejemplo.PersonaUbicacion.domain.Persona;
import com.ejemplo.PersonaUbicacion.domain.Telefono;

import java.util.HashSet;
import java.util.Set;

public class PersonaDTO {

    private Integer idPersona;
    private String nombre;
    private String apellido;
    private int edad;
    private Set<TelefonoDTO> telefonos;
    private Set<Domicilio> domicilios;

    public PersonaDTO(Persona persona){
        this.idPersona = persona.getIdPersona();
        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.edad = persona.getEdad();
        this.domicilios = persona.getDomicilios();
        this.telefonos = new HashSet<>();
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Set<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

    public void setTelefonos(Set<TelefonoDTO> telefonos) {
        this.telefonos = telefonos;
    }

    public Set<TelefonoDTO> getTelefonos() {
        return telefonos;
    }
}
