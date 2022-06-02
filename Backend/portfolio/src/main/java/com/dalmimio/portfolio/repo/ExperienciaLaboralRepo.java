package com.dalmimio.portfolio.repo;

import com.dalmimio.portfolio.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaLaboralRepo extends JpaRepository<ExperienciaLaboral, Long>{

    void deleteExperienciaLaboralById(Long id);
    
}