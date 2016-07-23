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
@Table(name = "SalaCine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalaCine.findAll", query = "SELECT s FROM SalaCine s"),
    @NamedQuery(name = "SalaCine.findBySalaCineid", query = "SELECT s FROM SalaCine s WHERE s.salaCineid = :salaCineid"),
    @NamedQuery(name = "SalaCine.findByNombre", query = "SELECT s FROM SalaCine s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "SalaCine.findByCapacidad", query = "SELECT s FROM SalaCine s WHERE s.capacidad = :capacidad"),
    @NamedQuery(name = "SalaCine.findByCineId", query = "SELECT s FROM SalaCine s WHERE s.cineId = :cineId")})
public class SalaCine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "salaCine_id")
    private Integer salaCineid;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "capacidad")
    private Integer capacidad;
    @Size(max = 45)
    @Column(name = "cine_id")
    private String cineId;

    public SalaCine() {
    }

    public SalaCine(Integer salaCineid) {
        this.salaCineid = salaCineid;
    }

    public Integer getSalaCineid() {
        return salaCineid;
    }

    public void setSalaCineid(Integer salaCineid) {
        this.salaCineid = salaCineid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getCineId() {
        return cineId;
    }

    public void setCineId(String cineId) {
        this.cineId = cineId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaCineid != null ? salaCineid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalaCine)) {
            return false;
        }
        SalaCine other = (SalaCine) object;
        if ((this.salaCineid == null && other.salaCineid != null) || (this.salaCineid != null && !this.salaCineid.equals(other.salaCineid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.SalaCine[ salaCineid=" + salaCineid + " ]";
    }
    
}
