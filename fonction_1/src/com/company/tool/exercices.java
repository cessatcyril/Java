package com.company.tool;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercices {

    public static double calcul() {
        String operateur;
        double val1;
        double val2;
        double resultat = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le premier nombre :");
        val1 = sc.nextDouble();
        System.out.println("entrer l'opérateur numérique :");
        operateur = sc.next();
        System.out.println("entrer le deuxième nombre :");
        val2 = sc.nextDouble();


        switch (operateur) {
            case "+":
                resultat = val1 + val2;
                break;
            case "-":
                resultat = val1 - val2;
                break;
            case "*":
                resultat = val1 * val2;
                break;
            case "/":
                if (val2 != 0) {
                    resultat = val1 / val2;
                } else {
                    System.out.println("la division est impossible");
                }
                break;
            default:
                System.out.println("Le signe de calcul doit être +, -, * ou /");
                break;
        }
        return resultat;
    }

    public static String concat(String chaine1, String chaine2) {

        String resultat;

        resultat = chaine1 + chaine2;
        return resultat;
    }


    public static int compteMot() {
        String st;
        String cut = "\\s+|,\\s*|\\.\\s*";
        String[] mot;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer une phrase :");
        st = sc.nextLine();

        mot = st.split(cut);

        return mot.length;
    }

    public static int fibonacci(int nbMax, int nb1, int nb2) {

        if (nb1 <= nbMax) {
            int nb3 = nb1 + nb2;
            nb1 = nb2;
            nb2 = nb3;
            System.out.println(nb3);
            return fibonacci(nbMax, nb1, nb2);
        }
        return 0;
    }

    public static int tableMultiplication(int nb) {
        for (int i = 0; i < 10; i++) {
            int res = (i + 1) * nb;
            System.out.println((i + 1) + " * " + nb + " = " + res);
        }
        return 0;
    }

    public static int compteLettre(String phrase, char lettre) {
        int resultat = 0;

        for (char i : phrase.toCharArray()
        ) {
            if (i == lettre) {
                resultat++;
            }
        }
        return resultat;
    }

    public static String strtok(String str1, String str2, int n) {
        String resultat;
        String[] table;
        table = str1.split(str2);

        resultat = table[n-1];

        return resultat;
    }


}

