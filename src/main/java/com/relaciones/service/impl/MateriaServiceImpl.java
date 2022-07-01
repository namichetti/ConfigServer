package com.relaciones.service.impl;

import com.relaciones.exception.CustomException;
import com.relaciones.model.Alumno;
import com.relaciones.model.Materia;
import com.relaciones.repository.CursoRepository;
import com.relaciones.repository.MateriaRepository;
import com.relaciones.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public List<Materia> findAll() {
        return (List<Materia>) this.materiaRepository.findAll();
    }

    @Override
    public Materia findById(Long id) throws CustomException {
        Optional<Materia> materia =this.materiaRepository.findById(id);
        if(materia.isPresent()){
            return materia.get();
        }else{
            throw new CustomException("No existe Materia");
        }
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(Materia materia) {

    }
}
