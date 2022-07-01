package com.relaciones.service.impl;

import com.relaciones.model.Libreta;
import com.relaciones.repository.CursoRepository;
import com.relaciones.repository.LibretaRepository;
import com.relaciones.service.LibretaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibretaServiceImpl implements LibretaService {

    @Autowired
    private LibretaRepository libretaRepository;

    @Override
    public List<Libreta> findAll() {
        return null;
    }

    @Override
    public Libreta findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Libreta libreta) {

    }
}
