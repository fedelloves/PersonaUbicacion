package com.ejemplo.PersonaUbicacion.domain;

import javax.persistence.*;

@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_domicilio")
    private Integer idDomicilio;
    private String calle;
    private Integer numero;

    public Domicilio(){}

    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "idDomicilio=" + idDomicilio +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                '}';
    }
}
