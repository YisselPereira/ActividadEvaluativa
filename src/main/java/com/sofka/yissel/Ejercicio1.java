package com.sofka.yissel;

import com.sun.security.auth.module.NTSystem;
import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        numero = reader.nextInt();
        System.out.println("El numero ingresado es " + numero);
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
