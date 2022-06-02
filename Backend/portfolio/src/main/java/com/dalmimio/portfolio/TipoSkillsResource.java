package com.dalmimio.portfolio;

import java.util.List;

import com.dalmimio.portfolio.model.TipoSkills;
import com.dalmimio.portfolio.servicios.TipoSkillsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoSkills")
public class TipoSkillsResource {
    private final TipoSkillsService tipoSkillsService;


    public TipoSkillsResource(TipoSkillsService tipoSkillsService){
        this.tipoSkillsService = tipoSkillsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TipoSkills>> getAllTipoSkills() {
        List<TipoSkills> tipoSkills = tipoSkillsService.findAllTipoSkills();
        return new ResponseEntity<>(tipoSkills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<TipoSkills> getTipoSkillsById(@PathVariable("id") Long id) {
        TipoSkills tipoSkills = tipoSkillsService.findTipoSkillsById(id);
        return new ResponseEntity<>(tipoSkills, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TipoSkills> addTipoSkills(@RequestBody TipoSkills tipoSkills) {
        TipoSkills newTipoSkills = tipoSkillsService.addTipoSkills(tipoSkills);
        return new ResponseEntity<>(newTipoSkills, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<TipoSkills> updateTipoSkills(@RequestBody TipoSkills tipoSkills) {
        TipoSkills updateTipoSkills = tipoSkillsService.updateTipoSkills(tipoSkills);
        return new ResponseEntity<>(updateTipoSkills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTipoSkills(@PathVariable("id") Long id) {
        tipoSkillsService.deleteTipoSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }    
}