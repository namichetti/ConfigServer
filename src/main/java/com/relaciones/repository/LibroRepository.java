package com.relaciones.repository;

import com.relaciones.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository  extends CrudRepository<Libro,Long> {
}
