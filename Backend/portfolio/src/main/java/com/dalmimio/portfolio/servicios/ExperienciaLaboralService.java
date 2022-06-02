package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;

import com.dalmimio.portfolio.model.ExperienciaLaboral;
import com.dalmimio.portfolio.repo.ExperienciaLaboralRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService {

    private final ExperienciaLaboralRepo experienciaLaboralRepo;

    @Autowired
    public ExperienciaLaboralService(ExperienciaLaboralRepo experienciaLaboralRepo){
        this.experienciaLaboralRepo = experienciaLaboralRepo;
    }

    public ExperienciaLaboral addExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        experienciaLaboral.setExperienciaLaboralCode(UUID.randomUUID().toString());
        return experienciaLaboral.save(experienciaLaboral);
    }

    public List<ExperienciaLaboral> findAllExperienciaLaboral(){
        return experienciaLaboralRepo.findAll();
    }
    
    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        return experienciaLaboralRepo.save(experienciaLaboral);
    }

    public void deleteExperienciaLaboral(Long id){
        experienciaLaboralRepo.deleteExperienciaLaboralById(id);
    }

    public ExperienciaLaboral findExperienciaLaboralById(Long id) {
        return null;
    }


}