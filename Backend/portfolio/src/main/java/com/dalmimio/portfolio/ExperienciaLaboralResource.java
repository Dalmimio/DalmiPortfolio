package com.dalmimio.portfolio;

import java.util.List;

import com.dalmimio.portfolio.model.ExperienciaLaboral;
import com.dalmimio.portfolio.servicios.ExperienciaLaboralService;

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
@RequestMapping("/experienciaLaboral")
public class ExperienciaLaboralResource {
    private final ExperienciaLaboralService experienciaLaboralService;

    public ExperienciaLaboralResource(ExperienciaLaboralService experienciaLaboralResource) {
        this.experienciaLaboralService = experienciaLaboralResource;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ExperienciaLaboral>> getAllExperienciaLaboral() {
        List<ExperienciaLaboral> experiencialaboral = experienciaLaboralService.findAllExperienciaLaboral();
        return new ResponseEntity<>(experiencialaboral, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ExperienciaLaboral> getExperienciaLaboralById(@PathVariable("id") Long id) {
        ExperienciaLaboral experienciaLaboral = experienciaLaboralService.findExperienciaLaboralById(id);
        return new ResponseEntity<>(experienciaLaboral, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ExperienciaLaboral> addExperienciaLaboral(
            @RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral newExperienciaLaboral = experienciaLaboralService.addExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(newExperienciaLaboral, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<ExperienciaLaboral> updateExperienciaLaboral(
            @RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral updateExperienciaLaboral = experienciaLaboralService
                .updateExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(updateExperienciaLaboral, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperienciaLaboral(@PathVariable("id") Long id) {
        experienciaLaboralService.deleteExperienciaLaboral(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}