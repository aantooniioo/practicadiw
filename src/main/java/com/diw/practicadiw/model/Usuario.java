package com.diw.practicadiw.model;

import com.diw.practica.model.Libro;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public enum Rol {ADMIN, PROFESOR, ALUMNO}
    @Enumerated (EnumType.STRING)
    private Rol rol;

    @OneToMany
    private List<com.diw.practica.model.Libro> libros = new ArrayList<>();

    public Usuario() {}

    public Usuario(Integer id, String nombre, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<com.diw.practica.model.Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}