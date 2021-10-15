package com.company;

import java.util.Scanner;

public class Main {
    final static double PI=3.1416;

    public static void main(String[] args) {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");

        double rayon;
        double perimetre;
        double air;

        System.out.println("Entrer le rayon: ");
        Scanner sc = new Scanner(System.in);
        rayon = sc.nextDouble();
        perimetre = 2 * PI * rayon;
        System.out.println("Le périmètre du cercle vaut: " + perimetre);
        air = rayon * rayon * PI;
        System.out.println("La surface du cercle vaut: " + air);
    }
}