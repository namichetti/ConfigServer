package com.relaciones.service.impl;

import com.relaciones.model.Computadora;
import com.relaciones.model.Libro;
import com.relaciones.repository.CursoRepository;
import com.relaciones.repository.LibroRepository;
import com.relaciones.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() {
        return null;
    }

    @Override
    public Libro findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Libro libro) {

    }
}
