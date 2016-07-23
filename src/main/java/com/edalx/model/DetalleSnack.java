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
@Table(name = "DetalleSnack")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleSnack.findAll", query = "SELECT d FROM DetalleSnack d"),
    @NamedQuery(name = "DetalleSnack.findByDetSnackid", query = "SELECT d FROM DetalleSnack d WHERE d.detSnackid = :detSnackid"),
    @NamedQuery(name = "DetalleSnack.findBySnackId", query = "SELECT d FROM DetalleSnack d WHERE d.snackId = :snackId"),
    @NamedQuery(name = "DetalleSnack.findByFacturaId", query = "SELECT d FROM DetalleSnack d WHERE d.facturaId = :facturaId")})
public class DetalleSnack implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "detSnack_id")
    private Integer detSnackid;
    @Column(name = "snack_id")
    private Integer snackId;
    @Size(max = 45)
    @Column(name = "factura_id")
    private String facturaId;

    public DetalleSnack() {
    }

    public DetalleSnack(Integer detSnackid) {
        this.detSnackid = detSnackid;
    }

    public Integer getDetSnackid() {
        return detSnackid;
    }

    public void setDetSnackid(Integer detSnackid) {
        this.detSnackid = detSnackid;
    }

    public Integer getSnackId() {
        return snackId;
    }

    public void setSnackId(Integer snackId) {
        this.snackId = snackId;
    }

    public String getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(String facturaId) {
        this.facturaId = facturaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSnackid != null ? detSnackid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleSnack)) {
            return false;
        }
        DetalleSnack other = (DetalleSnack) object;
        if ((this.detSnackid == null && other.detSnackid != null) || (this.detSnackid != null && !this.detSnackid.equals(other.detSnackid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.DetalleSnack[ detSnackid=" + detSnackid + " ]";
    }
    
}
