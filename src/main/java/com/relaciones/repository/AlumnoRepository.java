package com.relaciones.repository;

import com.relaciones.model.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno,Long> {
}
