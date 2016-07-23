/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edalx.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author edalx
 */
@Entity
@Table(name = "Pelicula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p"),
    @NamedQuery(name = "Pelicula.findByPeliculaId", query = "SELECT p FROM Pelicula p WHERE p.peliculaId = :peliculaId"),
    @NamedQuery(name = "Pelicula.findByNombre", query = "SELECT p FROM Pelicula p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pelicula.findBySinopsis", query = "SELECT p FROM Pelicula p WHERE p.sinopsis = :sinopsis"),
    @NamedQuery(name = "Pelicula.findByEstreno", query = "SELECT p FROM Pelicula p WHERE p.estreno = :estreno"),
    @NamedQuery(name = "Pelicula.findByPortada", query = "SELECT p FROM Pelicula p WHERE p.portada = :portada")})
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pelicula_id")
    private Integer peliculaId;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 16777215)
    @Column(name = "duracion")
    private String duracion;
    @Size(max = 2500)
    @Column(name = "sinopsis")
    private String sinopsis;
    @Size(max = 45)
    @Column(name = "estreno")
    private String estreno;
    @Size(max = 400)
    @Column(name = "portada")
    private String portada;

    public Pelicula() {
    }

    public Pelicula(Integer peliculaId) {
        this.peliculaId = peliculaId;
    }

    public Integer getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(Integer peliculaId) {
        this.peliculaId = peliculaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peliculaId != null ? peliculaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.peliculaId == null && other.peliculaId != null) || (this.peliculaId != null && !this.peliculaId.equals(other.peliculaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Pelicula[ peliculaId=" + peliculaId + " ]";
    }
    
}
