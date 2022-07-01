package com.relaciones.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
}
