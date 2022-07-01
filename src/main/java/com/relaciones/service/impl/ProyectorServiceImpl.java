package com.relaciones.service.impl;

import com.relaciones.model.Proyector;
import com.relaciones.repository.CursoRepository;
import com.relaciones.repository.ProyectorRepository;
import com.relaciones.service.ProyectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectorServiceImpl implements ProyectorService {

    @Autowired
    private ProyectorRepository proyectorRepository;

    @Override
    public List<Proyector> findAll() {
        return null;
    }

    @Override
    public Proyector findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Proyector proyector) {

    }
}
