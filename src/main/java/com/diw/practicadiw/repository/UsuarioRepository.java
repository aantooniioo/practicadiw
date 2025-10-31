package com.diw.practicadiw.dao;

import com.diw.practicadiw.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}