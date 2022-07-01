package com.relaciones.service.impl;

import com.relaciones.exception.CustomException;
import com.relaciones.model.Alumno;
import com.relaciones.repository.AlumnoRepository;
import com.relaciones.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> findAll() {
        return (List<Alumno>) this.alumnoRepository.findAll();
    }

    @Override
    public Alumno findById(Long id) throws CustomException {
        Optional<Alumno> alumno =this.alumnoRepository.findById(id);
        if(alumno.isPresent()){
            return alumno.get();
        }else{
            throw new CustomException("No existe Alumno");
        }
    }

    @Override
    public void deleteById(Long id) throws CustomException {
        Optional<Alumno> alumno =this.alumnoRepository.findById(id);
        if(alumno.isPresent()){
           this.alumnoRepository.deleteById(alumno.get().getId());
        }else{
            throw new CustomException("No existe Alumno");
        }

    }

    @Override
    public void save(Alumno alumno) {
        this.alumnoRepository.save(alumno);
    }
}
