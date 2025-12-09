package com.diw.practica.dao;

import com.diw.practica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}