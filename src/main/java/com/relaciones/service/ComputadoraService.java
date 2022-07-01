package com.relaciones.service;

import com.relaciones.model.Alumno;
import com.relaciones.model.Computadora;

import java.util.List;

public interface ComputadoraService {

    List<Computadora> findAll();
    Computadora findById(Long id);
    void deleteById(Long id);
    void save(Computadora computadora);
}
