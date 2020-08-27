package com.caidosdelcatre.plandeahorro;

import com.caidosdelcatre.plandeahorro.repository.UserRepository;
import com.caidosdelcatre.plandeahorro.repository.impl.UserRepositoryImpl;
import com.caidosdelcatre.plandeahorro.ui.InputConsola;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Init implements com.caidosdelcatre.ItemMenuEjecutable {

    public static void main(String[] args) {
        Init instance = new Init();
        instance.ejecutar();
    }

    @Override
    public void ejecutar() {
        EntityManager em = Persistence.createEntityManagerFactory("planDeAhorro").createEntityManager();
        UserRepository userRepo = new UserRepositoryImpl(em);
        InputConsola entrada = new InputConsola(System.in);
        userRepo.save(entrada.obtenerUsuario());
    }
}
