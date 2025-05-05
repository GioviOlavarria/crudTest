package com.example.crudrapido.servicio;

import com.example.crudrapido.entidades.estudiante;
import com.example.crudrapido.repositorio.repositorioEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class servicioEstudiante {
    @Autowired
    repositorioEstudiante repositorioEstudiante;

    public List<estudiante> listarEstudiantes(){
        return repositorioEstudiante.findAll();
    }

    public Optional<estudiante> listarEstudiantes(Long id){
        return repositorioEstudiante.findById(id);
    }

    public void guardarOActualizar(estudiante estudiante){
        repositorioEstudiante.save(estudiante);
    }
    public void borrar(Long id){
        repositorioEstudiante.deleteById(id);
    }
}
