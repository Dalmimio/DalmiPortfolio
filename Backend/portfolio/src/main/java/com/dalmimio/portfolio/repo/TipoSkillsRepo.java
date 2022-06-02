package com.dalmimio.portfolio.repo;

import com.dalmimio.portfolio.model.TipoSkills;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoSkillsRepo extends JpaRepository<TipoSkills, Long> {

    void deleteTipoSkillsById(Long id);
    
}
