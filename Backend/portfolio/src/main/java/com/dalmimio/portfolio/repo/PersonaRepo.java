package com.dalmimio.portfolio.repo;
import com.dalmimio.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long> {
    void deletePersonaById(Long id);
}
