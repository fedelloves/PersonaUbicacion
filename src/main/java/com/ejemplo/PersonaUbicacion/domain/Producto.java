package com.ejemplo.PersonaUbicacion.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProducto;
    private String descripcion;
    private Double precio;
    private Date fechaAlta;

    public Producto() {

    }

    public Integer getId() {
        return idProducto;
    }

    public void setId(Integer id) {
        this.idProducto = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
