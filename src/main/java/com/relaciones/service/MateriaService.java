package com.relaciones.service;

import com.relaciones.exception.CustomException;
import com.relaciones.model.Materia;
import com.relaciones.model.Proyector;

import java.util.List;

public interface MateriaService {

    List<Materia> findAll();
    Materia findById(Long id) throws CustomException;
    void deleteById(Long id);
    void save(Materia materia);
}
