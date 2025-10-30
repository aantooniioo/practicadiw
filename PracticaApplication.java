package com.diw.practica;

import com.diw.practica.dao.UsuarioRepository;
import com.diw.practica.model.Libro;
import com.diw.practica.dao.LibroRepository;
import com.diw.practica.model.Usuario;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);


    }
    @PostConstruct
    public void init(){
        Libro libro = new Libro();
        Usuario usuario = new Usuario();

        libro.setTitulo("El Quijote");
        libro.setAutor("Miguel de Cervantes");
        libro.setIsbn("124563789");
        libroRepository.save(libro);

        usuario.setNombre("Antonio");
        usuario.setContrasena("1234");
        usuarioRepository.save(usuario);

    }
}





