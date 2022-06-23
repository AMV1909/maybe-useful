package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long ID;

    private String Nombre;
    private String Email;
    private Integer Prioridad;

    public String getEmail() {
        return Email;
    }

    public Long getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public Integer getPrioridad() {
        return Prioridad;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setID(Long iD) {
        ID = iD;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPrioridad(Integer prioridad) {
        Prioridad = prioridad;
    }
}
