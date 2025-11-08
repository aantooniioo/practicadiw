package com.diw.practicadiw.repository;

import com.diw.practicadiw.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
