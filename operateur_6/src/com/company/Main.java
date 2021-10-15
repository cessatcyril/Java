package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");
    int nB;
    char cA;

    Scanner sc = new Scanner(System.in);

    System.out.println("Entrer le numero unicode : ");
    nB = sc.nextInt();
    cA = (char) nB;
    System.out.println("le charactère unicode corespondant est : " + cA);

    }
}
