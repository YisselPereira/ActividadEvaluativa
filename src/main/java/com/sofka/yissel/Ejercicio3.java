package com.sofka.yissel;

import com.sun.security.auth.module.NTSystem;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double sueldo;
        String area;
        int hijos;
        System.out.println("Ingrese un sueldo basico");
        Scanner reader = new Scanner(System.in);
        sueldo = reader.nextDouble();
        System.out.println("Ingrese su area de trabajo");
        area = reader.next();
        System.out.println("Ingrese su numero de hijos");
        hijos = reader.nextInt();
        if (area == "Sistemas"){
            sueldo = sueldo * 1.25;
        }
        else {
            if (area == "Contabilidad"){
                sueldo = sueldo * 1.20;
            }
            else {
                sueldo = sueldo * 1.10;
            }
        }
        if (hijos >=2){
            sueldo = sueldo + 150 * hijos;
        }
        System.out.println("El sueldo es "+ sueldo);
    }
}
