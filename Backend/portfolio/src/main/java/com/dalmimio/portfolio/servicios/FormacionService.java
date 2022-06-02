package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;

import com.dalmimio.portfolio.model.Formacion;
import com.dalmimio.portfolio.repo.FormacionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService {

    private final FormacionRepo formacionRepo;

    @Autowired
    public FormacionService(FormacionRepo formacionRepo){
        this.formacionRepo = formacionRepo;
    }

    public Formacion addFormacion(Formacion formacion){
        formacion.setFormacionCode(UUID.randomUUID().toString());
        return formacionRepo.save(formacion);
    }

    public List<Formacion> findAllProyecto(){
        return formacionRepo.findAll();
    }
    
    public Formacion updateProyecto(Formacion formacion){
        return formacionRepo.save(formacion);
    }

    public void deleteFormacion(Long id){
        formacionRepo.deleteFormacionById(id);
    }

    public List<Formacion> findAllFormacion() {
        return null;
    }

    public Formacion findFormacionById(Long id) {
        return null;
    }

    public Formacion updateFormacion(Formacion formacion) {
        return null;
    }


}