package com.example.crudrapido.repositorio;

import com.example.crudrapido.entidades.estudiante;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface repositorioEstudiante extends JpaRepository<estudiante, Long>{
}
