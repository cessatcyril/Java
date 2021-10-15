package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nt;
        int index;
        String valeur;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer la taille du tableau :");
        nt = sc.nextInt();


        String[] tableE = new String[nt];

        for (index = 0; index < tableE.length; index++) {
            System.out.println("Saisissez une valeur :");
            valeur = sc.next();
            tableE[index] = valeur;
        }
        System.out.println("Le tableau contient :");
        for (index = 0; index < tableE.length; index++) {
            System.out.print(tableE[index]);
            System.out.println();
        }
    }
}
