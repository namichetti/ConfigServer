package com.relaciones.service.impl;

import com.relaciones.model.Alumno;
import com.relaciones.model.Computadora;
import com.relaciones.repository.AlumnoRepository;
import com.relaciones.repository.ComputadoraRepository;
import com.relaciones.service.ComputadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadoraServiceImpl implements ComputadoraService {

    @Autowired
    private ComputadoraRepository computadoraRepository;

    @Override
    public List<Computadora> findAll() {
        return null;
    }

    @Override
    public Computadora findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Computadora computadora) {

    }
}
