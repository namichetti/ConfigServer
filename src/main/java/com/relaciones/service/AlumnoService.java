package com.relaciones.service;

import com.relaciones.exception.CustomException;
import com.relaciones.model.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> findAll();
    Alumno findById(Long id) throws CustomException;
    void deleteById(Long id) throws CustomException;
    void save(Alumno alumno);
}
