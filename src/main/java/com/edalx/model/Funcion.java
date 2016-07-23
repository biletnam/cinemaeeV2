/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edalx.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author edalx
 */
@Entity
@Table(name = "Funcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcion.findAll", query = "SELECT f FROM Funcion f"),
    @NamedQuery(name = "Funcion.findByFuncionId", query = "SELECT f FROM Funcion f WHERE f.funcionId = :funcionId"),
    @NamedQuery(name = "Funcion.findByHora", query = "SELECT f FROM Funcion f WHERE f.hora = :hora"),
    @NamedQuery(name = "Funcion.findByPrecio", query = "SELECT f FROM Funcion f WHERE f.precio = :precio"),
    @NamedQuery(name = "Funcion.findBySalaCineid", query = "SELECT f FROM Funcion f WHERE f.salaCineid = :salaCineid"),
    @NamedQuery(name = "Funcion.findByPeliculaId", query = "SELECT f FROM Funcion f WHERE f.peliculaId = :peliculaId")})
public class Funcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "funcion_id")
    private Integer funcionId;
    @Column(name = "hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "salaCine_id")
    private Integer salaCineid;
    @Size(max = 45)
    @Column(name = "pelicula_id")
    private String peliculaId;

    public Funcion() {
    }

    public Funcion(Integer funcionId) {
        this.funcionId = funcionId;
    }

    public Integer getFuncionId() {
        return funcionId;
    }

    public void setFuncionId(Integer funcionId) {
        this.funcionId = funcionId;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getSalaCineid() {
        return salaCineid;
    }

    public void setSalaCineid(Integer salaCineid) {
        this.salaCineid = salaCineid;
    }

    public String getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(String peliculaId) {
        this.peliculaId = peliculaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funcionId != null ? funcionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcion)) {
            return false;
        }
        Funcion other = (Funcion) object;
        if ((this.funcionId == null && other.funcionId != null) || (this.funcionId != null && !this.funcionId.equals(other.funcionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Funcion[ funcionId=" + funcionId + " ]";
    }
    
}
