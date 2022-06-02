package com.dalmimio.portfolio;

import java.util.List;

import com.dalmimio.portfolio.model.Proyecto;
import com.dalmimio.portfolio.servicios.ProyectoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class ProyectoResource {
    private final ProyectoService proyectoService;


    public ProyectoResource(ProyectoService proyectoService){
        this.proyectoService = proyectoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> getAllProyecto() {
        List<Proyecto> proyectos = proyectoService.findAllProyecto();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Proyecto> getProyectoById(@PathVariable("id") Long id) {
        Proyecto proyecto = proyectoService.findProyectoById(id);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto proyecto) {
        Proyecto newProyecto = proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto) {
        Proyecto updateFormacion = proyectoService.updateProyecto(proyecto);
        return new ResponseEntity<>(updateFormacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }    
}
