package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");

	String nX;
    String nY;
    String nZ;

    Scanner sc = new Scanner(System.in);
    System.out.println("entrer nX");
    nX = sc.next();
    System.out.println("entrer nY");
    nY = sc.next();

    nZ = nX;
    nX = nY;
    nY = nZ;


System.out.println("les valeurs inverser sont : nX = " + nX + " et nY = " + nY);

    }
}
