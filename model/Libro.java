package com.diw.practica.model;

import jakarta.persistence.*;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
        private String titulo;
        private String autor;
        private String editorial;
        private int anio;
        private String isbn;
        private double precio;

    public Libro() {

    }

    public enum estado{tramitado, pendiente, espera}
    @Enumerated(EnumType.STRING)
    private estado estado;

        public Libro(String titulo, String autor, String editorial, int anio, String isbn, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.anio = anio;
            this.isbn = isbn;
            this.precio = precio;
        }
        public Long  getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        // Getters y setters
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }

        public String getEditorial() { return editorial; }
        public void setEditorial(String editorial) { this.editorial = editorial; }

        public int getAnio() { return anio; }
        public void setAnio(int anio) { this.anio = anio; }

        public String getIsbn() { return isbn; }
        public void setIsbn(String isbn) { this.isbn = isbn; }

        public double getPrecio() { return precio; }
        public void setPrecio(double precio) { this.precio = precio; }

        @Override
        public String toString() {
            return titulo + " (" + autor + ") - " + precio + "€";
        }
    }

