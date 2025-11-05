package com.diw.practica.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String password;
    public enum rol{alumno, profesor, administrador};
    @Enumerated(EnumType.STRING)
    private rol rol;
    @OneToMany
    List<Libro> libros = new ArrayList<>();
    public Usuario() {

    }
    public Usuario(String usuario, String password, rol rol) {
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public rol getRol() {
        return rol;
    }
    public void setRol(rol rol) {
        this.rol = rol;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void anadirPedido(Libro libro) {
        libros.add(libro);
    }

}