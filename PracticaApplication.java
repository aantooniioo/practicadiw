package com.diw.practica;

import com.diw.practica.model.Libro;
import com.diw.practica.repository.LibroRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {
    private final LibroRepository libroRepository;

    public PracticaApplication(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
}

    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }
    @PostConstruct
    public void init(){
        Libro libro = new Libro();
        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setIsbn("124563789");
        libroRepository.save(libro);
    }
}

