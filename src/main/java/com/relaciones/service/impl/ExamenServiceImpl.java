package com.relaciones.service.impl;

import com.relaciones.model.Examen;
import com.relaciones.repository.CursoRepository;
import com.relaciones.repository.ExamenRepository;
import com.relaciones.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public List<Examen> findAll() {
        return null;
    }

    @Override
    public Examen findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Examen examen) {

    }
}
