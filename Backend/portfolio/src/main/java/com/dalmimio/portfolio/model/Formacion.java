package com.dalmimio.portfolio.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Formacion")

public class Formacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "institucion", length = 90, nullable = false)
    private String institucion;

    @Column(name = "inicio_formacion", nullable = false)
    private Date inicio_formacion;

    @Column(name = "fin_formacion", nullable = false)
    private Date fin_formacion;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    public Formacion() {
    }

    public Formacion(Long id, String institucion, Date inicio_formacion, Date fin_formacion, String titulo) {
        this.id = id;
        this.institucion = institucion;
        this.inicio_formacion = inicio_formacion;
        this.fin_formacion = fin_formacion;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getInicio_formacion() {
        return inicio_formacion;
    }

    public void setInicio_formacion(Date inicio_formacion) {
        this.inicio_formacion = inicio_formacion;
    }

    public Date getFin_formacion() {
        return fin_formacion;
    }

    public void setFin_formacion(Date fin_formacion) {
        this.fin_formacion = fin_formacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFormacionCode(String string) {
    }
    

    
}
