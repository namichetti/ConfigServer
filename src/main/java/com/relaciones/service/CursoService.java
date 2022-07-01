package com.relaciones.service;

import com.relaciones.model.Alumno;
import com.relaciones.model.Computadora;
import com.relaciones.model.Curso;

import java.util.List;

public interface CursoService {

    List<Curso> findAll();
    Curso findById(Long id);
    void deleteById(Long id);
    void save(Curso curso);
}
