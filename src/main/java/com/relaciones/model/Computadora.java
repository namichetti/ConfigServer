package com.relaciones.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="computadoras")
public class Computadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;


}
