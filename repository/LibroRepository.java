package com.diw.practica.repository;

import java.util.List;
import com.diw.practica.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Integer> {
}
