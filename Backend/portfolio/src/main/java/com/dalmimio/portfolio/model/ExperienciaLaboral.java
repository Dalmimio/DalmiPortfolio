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
@Table(name = "Experiencia_laboral")

public class ExperienciaLaboral implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "puesto", length = 45, nullable = false)
    private String puesto;

    @Column(name = "empresa", length = 45, nullable = false)
    private String empresa;

    @Column(name = "inicio", nullable = false)
    private Date inicio;

    @Column(name = "fin", nullable = false)
    private Date fin;

    public ExperienciaLaboral() {

    }

    public ExperienciaLaboral(Long id, String puesto, String empresa, Date inicio, Date fin) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setExperienciaLaboralCode(String string) {
    }

    public ExperienciaLaboral save(ExperienciaLaboral experienciaLaboral) {
        return null;
    }

}
