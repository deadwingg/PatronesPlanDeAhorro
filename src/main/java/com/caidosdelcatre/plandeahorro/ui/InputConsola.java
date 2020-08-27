/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caidosdelcatre.plandeahorro.ui;

import com.caidosdelcatre.plandeahorro.model.Usuario;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class InputConsola {

    private Scanner scan;

    public InputConsola(InputStream in) {
        this.scan = new Scanner(in);
    }

    public Usuario obtenerUsuario() {
        System.out.println("Ingrese nombre: ");
        String firstName = scan.nextLine();
        System.out.println("Ingrese apellido: ");
        String lastName = scan.nextLine();
        System.out.println("Ingrese auto: ");
        String car = scan.nextLine();
        return new Usuario(firstName, lastName, car);
    }

}
