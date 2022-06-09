/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

import Excepciones.*;
import java.util.Scanner;

/**
 *
 * @author farid
 */
public class Usuario {

    public Usuario(){
        String nomUsuario, password;
        Scanner teclado = new Scanner(System.in);
        boolean rep = true;
        do {
            try {
                System.out.println("Ingresa el usuario");
                nomUsuario = teclado.nextLine();
                if (nomUsuario.isBlank() || nomUsuario.isEmpty()) {
                    throw new UsrException("El nombre de usuario no puede estar vacio");
                }
                System.out.println("Ingresa la contraseña");
                password = teclado.nextLine();
                if (password.isBlank() || password.isEmpty()) {
                    throw new PasswordException("La contraseña no puede estar vacia");
                }
                if (nomUsuario.equals("tomioka")) {
                    if (password.equals("123456")) {
                        System.out.println("Bienvenido =D");
                        rep = false;
                    } else {
                        throw new PasswordException("Contraseña invalida");
                    }
                } else {
                    throw new UsrException("Usuario incorrecto");
                }
            } catch (UsrException | PasswordException e) {
                System.out.println(e.getMessage());
                rep = true;
            }
        } while (rep);
    }

}
