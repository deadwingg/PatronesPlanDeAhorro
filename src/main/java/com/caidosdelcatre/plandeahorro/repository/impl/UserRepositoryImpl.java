/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caidosdelcatre.plandeahorro.repository.impl;

import com.caidosdelcatre.plandeahorro.model.Usuario;
import com.caidosdelcatre.plandeahorro.repository.UserRepository;
import javax.persistence.EntityManager;

/**
 *
 * @author gomez
 */
public class UserRepositoryImpl implements UserRepository {

    EntityManager em;

    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Usuario user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("DB error");
        }
    }
}
