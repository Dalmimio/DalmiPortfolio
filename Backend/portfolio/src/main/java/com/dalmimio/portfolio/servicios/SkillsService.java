package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;

import com.dalmimio.portfolio.model.Skills;
import com.dalmimio.portfolio.repo.SkillsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo){
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skills){
        skills.setSkillsCode(UUID.randomUUID().toString());
        return skillsRepo.save(skills);
    }

    public List<Skills> findAllSkills(){
        return skillsRepo.findAll();
    }
    
    public Skills updateSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    public void deleteSkills(Long id){
        skillsRepo.deleteSkillsById(id);
    }

    public Skills findSkillsById(Long id) {
        return null;
    }


}