package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");

    Double nD;
    Double nI;
    Double nT;
    Double nR;

    System.out.println("entrer la note de devoir surveillé :");
        Scanner sc= new Scanner(System.in);
        nD = sc.nextDouble();

    System.out.println("Entrer la note d'intérogation écrite :");
        nI = sc.nextDouble();

    System.out.println("Enter la note de travaux pratique :");
        nT = sc.nextDouble();

    nR = ((nD * 3) + (nI * 2) + nT) / 6;

    System.out.println("La moyenne est de : " + nR);



    }
}
