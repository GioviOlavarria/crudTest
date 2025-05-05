package com.example.crudrapido.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tabla_estudiante")
public class estudiante {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_estudiante;

    private String primerNombre;

    private String primerApellido;

    @Column(name = "correo_electronico", unique = true, nullable = false)
    private String email;

}
