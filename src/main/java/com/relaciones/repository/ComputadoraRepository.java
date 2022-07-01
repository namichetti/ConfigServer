package com.relaciones.repository;

import com.relaciones.model.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository  extends CrudRepository<Computadora,Long> {
}
