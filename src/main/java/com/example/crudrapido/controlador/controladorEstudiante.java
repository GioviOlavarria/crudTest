package com.example.crudrapido.controlador;

import com.example.crudrapido.entidades.estudiante;
import com.example.crudrapido.servicio.servicioEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = api/v1/estudiantes)
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
    @PostMapping
    public void List<estudiante> getAll(@RequestBody estudiante estudiante){
        return servicioEstudiante.guardarOActualizar(estudiante);
    }
    @DeleteMapping("/{idEstudiante}")
    public void delete(@PathVariable ("idEstudiante") Long idEstudiante{
        servicioEstudiante.delete(id_estudiante);
    }
}
