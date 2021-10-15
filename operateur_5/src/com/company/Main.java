package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("**** Périmètre et surface du Cercle (V1.0, 11/10/21) ****");

    int nS;
    int nSec = 0;
    int nMin = 0;
    int nHeu =0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Entrer le nombre de seconde: ");
    nS = sc.nextInt();

        while (nS > 0) {
            if (nS >3600) {
                nS -= 3600;
                nHeu ++;
            } else if (nS > 60) {
                nS -= 60;
                nMin ++;
            } else {
                nSec = nS;
                nS = 0;
            }
        }

        System.out.println("L'heure sous format est " + nHeu + ":" + nMin + ":" + nSec);



    }
}
