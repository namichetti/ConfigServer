package com.relaciones.service;

import com.relaciones.model.Libro;

import java.util.List;

public interface LibroService {

    List<Libro> findAll();
    Libro findById(Long id);
    void deleteById(Long id);
    void save(Libro libro);
}
