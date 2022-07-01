package com.relaciones.service.impl;

import com.relaciones.model.Curso;
import com.relaciones.repository.ComputadoraRepository;
import com.relaciones.repository.CursoRepository;
import com.relaciones.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return null;
    }

    @Override
    public Curso findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Curso curso) {

    }
}
