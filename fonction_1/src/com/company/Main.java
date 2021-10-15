package com.company;

import com.company.tool.exercices;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        while (true) {
            Scanner sc = new Scanner(System.in);
            int n;
            String phrase;
            String separateur;
            char lettre;

            System.out.println("veuillez choisir l'exercice : ");
            System.out.println("0.quitter");
            System.out.println("1.Calculatrice");
            System.out.println("2.Chaine de caractères");
            System.out.println("3.nombre de mots dans une phrase");
            System.out.println("4.suite de fibonacci");
            System.out.println("5.table de multiplication");
            System.out.println("6.nombre de lettre dans une phrase");
            System.out.println("7.le n ième mot");

            n = sc.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> System.out.println(exercices.calcul());
                case 2 -> System.out.println(exercices.concat("Je suis ", "un lapin"));
                case 3 -> System.out.println(exercices.compteMot());
                case 4 -> {
                    System.out.println("entrer un nombre :");
                    n = sc.nextInt();
                    exercices.fibonacci(n, 1, 0);
                }
                case 5 -> {
                    System.out.println("entrer le numero de la tablede multiplication :");
                    n = sc.nextInt();
                    exercices.tableMultiplication(n);
                }
                case 6 -> {
                    System.out.println("entrer la phrase :");
                    sc.nextLine();
                    phrase = sc.nextLine();
                    System.out.println("entrer la lettre à compter");
                    lettre = sc.next().charAt(0);
                    System.out.println("Le nombre de " + lettre + " dans la phrase est : " + exercices.compteLettre(phrase, lettre));
                }
                case 7 -> {
                    System.out.println("entrer la chaine de charactère :");
                    sc.nextLine();
                    phrase = sc.nextLine();
                    System.out.println("entrer le séparateur");
                    separateur = sc.next();
                    System.out.println("entrer un nombre :");
                    n = sc.nextInt();
                    System.out.println("le résultat est : " + exercices.strtok(phrase,separateur,n));
                }
                default -> System.out.println("saisie invalide");
            }
        }

    }
}
