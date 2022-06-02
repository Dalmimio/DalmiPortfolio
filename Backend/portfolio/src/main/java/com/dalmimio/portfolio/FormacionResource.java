package com.dalmimio.portfolio;

import java.util.List;

import com.dalmimio.portfolio.model.Formacion;
import com.dalmimio.portfolio.servicios.FormacionService;

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
@RequestMapping("/formacion")
public class FormacionResource {
    private final FormacionService formacionService;

    public FormacionResource(FormacionService formacionService) {
        this.formacionService = formacionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Formacion>> getAllFormacion() {
        List<Formacion> formacion = formacionService.findAllFormacion();
        return new ResponseEntity<>(formacion, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Formacion> getFormacionById(@PathVariable("id") Long id) {
        Formacion formacion = formacionService.findFormacionById(id);
        return new ResponseEntity<>(formacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Formacion> addFormacion(@RequestBody Formacion formacion) {
        Formacion newFormacion = formacionService.addFormacion(formacion);
        return new ResponseEntity<>(newFormacion, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Formacion> updateFormacion(@RequestBody Formacion formacion) {
        Formacion updateFormacion = formacionService.updateFormacion(formacion);
        return new ResponseEntity<>(updateFormacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFormacion(@PathVariable("id") Long id) {
        formacionService.deleteFormacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}