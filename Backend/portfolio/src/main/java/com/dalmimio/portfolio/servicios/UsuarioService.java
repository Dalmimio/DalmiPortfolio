package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;

import com.dalmimio.portfolio.model.Usuario;
import com.dalmimio.portfolio.repo.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }

    public Usuario addUsuario(Usuario usuario){
        usuario.setUsuarioCode(UUID.randomUUID().toString());
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> findAllUsuario(){
        return usuarioRepo.findAll();
    }
    
    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public void deleteusuario(Long id){
        usuarioRepo.deleteUsuarioById(id);
    }

    public Usuario findUsuarioById(Long id) {
        return null;
    }

    public void deleteUsuario(Long id) {
    }


}