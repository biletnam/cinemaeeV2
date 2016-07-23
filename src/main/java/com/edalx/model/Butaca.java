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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author edalx
 */
@Entity
@Table(name = "Butaca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Butaca.findAll", query = "SELECT b FROM Butaca b"),
    @NamedQuery(name = "Butaca.findByButacaId", query = "SELECT b FROM Butaca b WHERE b.butacaId = :butacaId"),
    @NamedQuery(name = "Butaca.findByNumButaca", query = "SELECT b FROM Butaca b WHERE b.numButaca = :numButaca"),
    @NamedQuery(name = "Butaca.findByFila", query = "SELECT b FROM Butaca b WHERE b.fila = :fila"),
    @NamedQuery(name = "Butaca.findBySalaCineid", query = "SELECT b FROM Butaca b WHERE b.salaCineid = :salaCineid")})
public class Butaca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "butaca_id")
    private Integer butacaId;
    @Column(name = "numButaca")
    private Integer numButaca;
    @Column(name = "fila")
    private Integer fila;
    @Column(name = "salaCine_id")
    private Integer salaCineid;

    public Butaca() {
    }

    public Butaca(Integer butacaId) {
        this.butacaId = butacaId;
    }

    public Integer getButacaId() {
        return butacaId;
    }

    public void setButacaId(Integer butacaId) {
        this.butacaId = butacaId;
    }

    public Integer getNumButaca() {
        return numButaca;
    }

    public void setNumButaca(Integer numButaca) {
        this.numButaca = numButaca;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getSalaCineid() {
        return salaCineid;
    }

    public void setSalaCineid(Integer salaCineid) {
        this.salaCineid = salaCineid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (butacaId != null ? butacaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Butaca)) {
            return false;
        }
        Butaca other = (Butaca) object;
        if ((this.butacaId == null && other.butacaId != null) || (this.butacaId != null && !this.butacaId.equals(other.butacaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Butaca[ butacaId=" + butacaId + " ]";
    }
    
}
