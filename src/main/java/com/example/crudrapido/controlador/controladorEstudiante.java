package com.example.crudrapido.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.entidades.estudiante;
import com.example.crudrapido.servicio.servicioEstudiante;


@RestController
@RequestMapping(path = "api/v1/estudiantes")
public class controladorEstudiante {

    @Autowired
    private final servicioEstudiante servicioEstudiante;

    public controladorEstudiante(servicioEstudiante servicioEstudiante) {
        this.servicioEstudiante = servicioEstudiante;
    }
    @GetMapping
    public List<estudiante> getAll(){
        return servicioEstudiante.listarEstudiantes();
    }
    @GetMapping("/{id_estudiante}")
    public Optional<estudiante> getBId(@PathVariable("id_estudiante") Long id_estudiante){
        return servicioEstudiante.listarEstudiantes(id_estudiante);
    }
    @PostMapping
    public void guardarActualizar(@RequestBody estudiante estudiante){
        servicioEstudiante.guardarOActualizar(estudiante);
    }
    @DeleteMapping("/{id_estudiante}")
    public void delete(@PathVariable("id_estudiante") Long id_estudiante){
        servicioEstudiante.borrar(id_estudiante);
    }
}

