/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edalx.session;

import com.edalx.model.Snack;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edalx
 */
@Stateless
public class SnackFacade extends AbstractFacade<Snack> {

    @PersistenceContext(unitName = "com.edalx_cinemaEEv2_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SnackFacade() {
        super(Snack.class);
    }
    
}
