package com.relaciones.service;

import com.relaciones.model.Computadora;
import com.relaciones.model.Examen;

import java.util.List;

public interface ExamenService {

    List<Examen> findAll();
    Examen findById(Long id);
    void deleteById(Long id);
    void save(Examen examen);
}
