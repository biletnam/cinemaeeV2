/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edalx.session;

import com.edalx.model.Pelicula;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edalx
 */
@Stateless
public class PeliculaFacade extends AbstractFacade<Pelicula> {

    @PersistenceContext(unitName = "com.edalx_cinemaEEv2_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeliculaFacade() {
        super(Pelicula.class);
    }
    
}
