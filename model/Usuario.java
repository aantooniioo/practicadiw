package com.diw.practica.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contrasena;

    public enum rol{alumno, profesor, administrador}
    @Enumerated(EnumType.STRING)
    private rol rol;
    @OneToMany
    ArrayList<Libro> libros = new ArrayList<>();

    public Usuario(String nombre, String contrasena, rol rol) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    public Usuario() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public rol getRol() { return rol; }
    public void setRol(rol rol) { this.rol = rol; }
    public ArrayList<Libro> getLibros() { return libros; }
    public void setLibros(ArrayList<Libro> libros) { this.libros = libros; }

    public void anadirPedido(Libro libro){
        libros.add(libro);
    }
}
