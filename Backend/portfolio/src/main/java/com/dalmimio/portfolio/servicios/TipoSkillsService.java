package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;


import com.dalmimio.portfolio.model.TipoSkills;
import com.dalmimio.portfolio.repo.TipoSkillsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoSkillsService {

    private final TipoSkillsRepo tiposkillsRepo;

    @Autowired
    public TipoSkillsService(TipoSkillsRepo tiposkillsRepo){
        this.tiposkillsRepo = tiposkillsRepo;
    }

    public TipoSkills addTipoSkills(TipoSkills tiposkills){
        tiposkills.setTipoSkillsCode(UUID.randomUUID().toString());
        return tiposkillsRepo.save(tiposkills);
    }

    public List<TipoSkills> findAllTipoSkills(){
        return tiposkillsRepo.findAll();
    }
    
    public TipoSkills updateTipoSkills(TipoSkills tiposkills){
        return tiposkillsRepo.save(tiposkills);
    }

    public void deleteTipoSkills(Long id){
        tiposkillsRepo.deleteTipoSkillsById(id);
    }

    public TipoSkills findTipoSkillsById(Long id) {
        return null;
    }


}