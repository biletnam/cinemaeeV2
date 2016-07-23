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
@Table(name = "Boleto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleto.findAll", query = "SELECT b FROM Boleto b"),
    @NamedQuery(name = "Boleto.findByDetalleCompra", query = "SELECT b FROM Boleto b WHERE b.detalleCompra = :detalleCompra"),
    @NamedQuery(name = "Boleto.findByButacaId", query = "SELECT b FROM Boleto b WHERE b.butacaId = :butacaId"),
    @NamedQuery(name = "Boleto.findByFacturaId", query = "SELECT b FROM Boleto b WHERE b.facturaId = :facturaId"),
    @NamedQuery(name = "Boleto.findByFuncionId", query = "SELECT b FROM Boleto b WHERE b.funcionId = :funcionId")})
public class Boleto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DetalleCompra")
    private Integer detalleCompra;
    @Column(name = "butaca_id")
    private Integer butacaId;
    @Column(name = "factura_id")
    private Integer facturaId;
    @Column(name = "funcion_id")
    private Integer funcionId;

    public Boleto() {
    }

    public Boleto(Integer detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public Integer getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(Integer detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public Integer getButacaId() {
        return butacaId;
    }

    public void setButacaId(Integer butacaId) {
        this.butacaId = butacaId;
    }

    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }

    public Integer getFuncionId() {
        return funcionId;
    }

    public void setFuncionId(Integer funcionId) {
        this.funcionId = funcionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleCompra != null ? detalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Boleto)) {
            return false;
        }
        Boleto other = (Boleto) object;
        if ((this.detalleCompra == null && other.detalleCompra != null) || (this.detalleCompra != null && !this.detalleCompra.equals(other.detalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.edalx.model.Boleto[ detalleCompra=" + detalleCompra + " ]";
    }
    
}
