package com.dalmimio.portfolio;

import java.util.List;

import com.dalmimio.portfolio.model.Persona;
import com.dalmimio.portfolio.servicios.PersonaService;

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
@RequestMapping("/persona")
public class PersonaResource {
    private final PersonaService personaService;

    public PersonaResource(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersona() {
        List<Persona> persona = personaService.findAllPersonas();
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id) {
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
        Persona newPersona = personaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
        Persona updatePersona = personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}