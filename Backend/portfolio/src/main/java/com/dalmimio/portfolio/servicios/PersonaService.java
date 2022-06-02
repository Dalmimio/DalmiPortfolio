package com.dalmimio.portfolio.servicios;

import com.dalmimio.portfolio.model.Persona;
import com.dalmimio.portfolio.repo.PersonaRepo;

import java.util.UUID;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    private final PersonaRepo personaRepo;
    
    @Autowired
    public PersonaService(PersonaRepo personaRepo){
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona){
        persona.setPersonaCode(UUID.randomUUID().toString());
        return personaRepo.save(persona);

    }

    public List<Persona> findAllPersonas(){
        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona){
        return personaRepo.save(persona);
    }

    public void deletePersona(Long id){
        personaRepo.deletePersonaById(id);
    }

    public Persona findPersonaById(Long id) {
        return null;
    }
}
