package com.relaciones.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
}
