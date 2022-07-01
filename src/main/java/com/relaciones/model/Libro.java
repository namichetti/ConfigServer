package com.relaciones.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private Integer paginas;

}
