package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index;
        int n = 0;
        String nomSaisie;
        String[] tableTest = new String[20];
        String[] tableNom = new String[]{
                "Jean",
                "Jule",
                "René",
                "Paul",
                "Pierre",
                "Julie",
                "Marrie",
                "George",
                "Thibaut",
                "David",
                "Loic",
                "Jordan",
                "Luca",
                "Marine",
                "Assia",
                "Maelle",
                "Alexa",
                "lisa",
                "Angele",
                "Noemie"};

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nom à effacer :");
        nomSaisie = sc.next();

        for (index = 0; index < tableNom.length; index++) {

            if (tableNom[index].equals(nomSaisie)) {
                continue;
            }

            tableTest[n] =tableNom[index];
            n++;
        }


        for (index = 0; index < tableTest.length; index++) {
            System.out.print(tableTest[index]);
            System.out.println();
        }
    }
}
