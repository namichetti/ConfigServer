package com.relaciones.service;

import com.relaciones.model.Libro;
import com.relaciones.model.Proyector;

import java.util.List;

public interface ProyectorService {

    List<Proyector> findAll();
    Proyector findById(Long id);
    void deleteById(Long id);
    void save(Proyector proyector);
}
