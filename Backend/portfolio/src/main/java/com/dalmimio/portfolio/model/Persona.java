/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dalmimio.portfolio.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 *
 * @author dalim
 */
@Entity
@Table(name = "Persona")

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;

    @Column(name = "acercade", length = 550, nullable = false)
    private String acercade;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @Column(name = "nacimiento", nullable = false)
    private Date nacimiento;

    @Column(name = "localizacion", length = 50, nullable = false)
    private String localizacion;

    @Column(name = "breve_description", length = 100, nullable = false)
    private String breve_description;

    @Column(name = "url_img_perfil", length = 90, nullable = false)
    private String url_img_perfil;

    @Column(name = "url_img_about", length = 90, nullable = false)
    private String url_img_about;

    public Persona() {

    }

    public Persona(Long id, String nombre, String apellido, String acercade, String email, Date nacimiento,
            String localizacion, String breve_description, String url_img_perfil, String url_img_about) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercade = acercade;
        this.email = email;
        this.nacimiento = nacimiento;
        this.localizacion = localizacion;
        this.breve_description = breve_description;
        this.url_img_perfil = url_img_perfil;
        this.url_img_about = url_img_about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getBreve_description() {
        return breve_description;
    }

    public void setBreve_description(String breve_description) {
        this.breve_description = breve_description;
    }

    public String getUrl_img_perfil() {
        return url_img_perfil;
    }

    public void setUrl_img_perfil(String url_img_perfil) {
        this.url_img_perfil = url_img_perfil;
    }

    public String getUrl_img_about() {
        return url_img_about;
    }

    public void setUrl_img_about(String url_img_about) {
        this.url_img_about = url_img_about;
    }

    public void setPersonaCode(String string) {
    }

}
