package com.relaciones.service;

import com.relaciones.model.Examen;
import com.relaciones.model.Libreta;

import java.util.List;

public interface LibretaService {

    List<Libreta> findAll();
    Libreta findById(Long id);
    void deleteById(Long id);
    void save(Libreta libreta);
}
