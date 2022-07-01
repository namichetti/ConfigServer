package com.relaciones.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private Integer capacidad;


}
