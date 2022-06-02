package com.dalmimio.portfolio.repo;

import com.dalmimio.portfolio.model.Skills;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills, Long> {

    void deleteSkillsById(Long id);
    
}
