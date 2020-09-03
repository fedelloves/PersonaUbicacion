package com.ejemplo.PersonaUbicacion.dto;

import com.ejemplo.PersonaUbicacion.domain.Telefono;

public class TelefonoDTO {

    private Integer idTelefono;
    private String tipo;
    private Integer numero;

    public TelefonoDTO(){};

    public TelefonoDTO(Telefono telefono) {
        this.idTelefono = telefono.getIdTelefono();
        this.tipo = telefono.getTipo();
        this.numero = telefono.getNumero();
    }

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
