package com.sofka.yissel;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner reader = new Scanner(System.in);
        int millas = 0;
        millas = reader.nextInt();
        System.out.println("La millas son " + millas);
        double km = millas * 1.6093;
        System.out.println("Los kilometros son "+ Math.round(km*100.0)/100.0);
    }
}
