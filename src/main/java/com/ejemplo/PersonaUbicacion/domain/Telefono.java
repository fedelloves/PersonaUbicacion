package com.ejemplo.PersonaUbicacion.domain;

import javax.persistence.*;

@Entity
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_telefono")
    private Integer idTelefono;
    private String tipo;
    private Integer numero;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    public Telefono(){
        this.persona = null;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "idTelefono=" + idTelefono +
                ", tipo='" + tipo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
