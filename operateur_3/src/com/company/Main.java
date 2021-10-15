package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");
	Double nF;
    Double nC;

    System.out.println("Entrer la températur en degrés Fahrenheit :");
        Scanner sc = new Scanner(System.in);
        nF = sc.nextDouble();

    nC = (nF - 32) / 1.8;
    System.out.println("La température en degrés Celsuis est de : " + nC);
    }
}
