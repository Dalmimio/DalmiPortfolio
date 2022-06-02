package com.dalmimio.portfolio.repo;
import com.dalmimio.portfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{

    void deleteUsuarioById(Long id);
    
}
