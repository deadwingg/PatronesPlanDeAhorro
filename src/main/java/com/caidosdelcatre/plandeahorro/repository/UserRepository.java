/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caidosdelcatre.plandeahorro.repository;

import com.caidosdelcatre.plandeahorro.model.Usuario;

/**
 *
 * @author gomez
 */
public interface UserRepository {

    public void save(Usuario user);
}
