package com.relaciones.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="proyectores")
public class Proyector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;

}
