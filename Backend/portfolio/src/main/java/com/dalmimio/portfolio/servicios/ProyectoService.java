package com.dalmimio.portfolio.servicios;

import java.util.List;
import java.util.UUID;

import com.dalmimio.portfolio.model.Proyecto;
import com.dalmimio.portfolio.repo.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo){
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto){
        proyecto.setProyectoCode(UUID.randomUUID().toString());
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> findAllProyecto(){
        return proyectoRepo.findAll();
    }
    
    public Proyecto updateProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }

    public void deleteProyecto(Long id){
        proyectoRepo.deleteProyectoById(id);
    }

    public Proyecto findProyectoById(Long id) {
        return null;
    }

    public Proyecto addFormacion(Proyecto proyecto) {
        return null;
    }


}
