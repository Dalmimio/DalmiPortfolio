package com.dalmimio.portfolio.repo;

import com.dalmimio.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    void deleteProyectoById(Long id);
}
