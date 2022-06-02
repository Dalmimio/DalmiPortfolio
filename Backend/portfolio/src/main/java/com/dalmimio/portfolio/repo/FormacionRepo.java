package com.dalmimio.portfolio.repo;

import com.dalmimio.portfolio.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormacionRepo extends JpaRepository<Formacion, Long> {
    void deleteFormacionById(Long id);
}
