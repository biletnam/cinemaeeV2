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
@Table(name = "Snack")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Snack.findAll", query = "SELECT s FROM Snack s"),
    @NamedQuery(name = "Snack.findBySnackId", query = "SELECT s FROM Snack s WHERE s.snackId = :snackId"),
    @NamedQuery(name = "Snack.findByNombre", query = "SELECT s FROM Snack s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Snack.findByTamano", query = "SELECT s FROM Snack s WHERE s.tamano = :tamano"),
    @NamedQuery(name = "Snack.findByPrecio", query = "SELECT s FROM Snack s WHERE s.precio = :precio")})
public class Snack implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "snack_id")
    private Integer snackId;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "tamano")
    private String tamano;
    @Size(max = 45)
    @Column(name = "precio")
    private String precio;

    public Snack() {
    }

    public Snack(Integer snackId) {
        this.snackId = snackId;
    }

    public Integer getSnackId() {
        return snackId;
    }

    public void setSnackId(Integer snackId) {
        this.snackId = snackId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (snackId != null ? snackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Snack)) {
            return false;
        }
        Snack other = (Snack) object;
        if ((this.snackId == null && other.snackId != null) || (this.snackId != null && !this.snackId.equals(other.snackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Snack[ snackId=" + snackId + " ]";
    }
    
}
