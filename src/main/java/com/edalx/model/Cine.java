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
@Table(name = "Cine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cine.findAll", query = "SELECT c FROM Cine c"),
    @NamedQuery(name = "Cine.findByCineId", query = "SELECT c FROM Cine c WHERE c.cineId = :cineId"),
    @NamedQuery(name = "Cine.findByCineName", query = "SELECT c FROM Cine c WHERE c.cineName = :cineName")})
public class Cine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cine_id")
    private Integer cineId;
    @Size(max = 45)
    @Column(name = "cine_name")
    private String cineName;

    public Cine() {
    }

    public Cine(Integer cineId) {
        this.cineId = cineId;
    }

    public Integer getCineId() {
        return cineId;
    }

    public void setCineId(Integer cineId) {
        this.cineId = cineId;
    }

    public String getCineName() {
        return cineName;
    }

    public void setCineName(String cineName) {
        this.cineName = cineName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cineId != null ? cineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cine)) {
            return false;
        }
        Cine other = (Cine) object;
        if ((this.cineId == null && other.cineId != null) || (this.cineId != null && !this.cineId.equals(other.cineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Cine[ cineId=" + cineId + " ]";
    }
    
}
