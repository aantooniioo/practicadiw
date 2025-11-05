package com.diw.practica.dao;

import com.diw.practica.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Integer> {
}
