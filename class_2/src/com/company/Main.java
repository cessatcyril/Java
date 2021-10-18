package com.company;

import com.company.tool.TriNombre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int nb;
        TriNombre tri = new TriNombre();
        while (true) {
            System.out.println("choisir : ");
            System.out.println("0.quitter : ");
            System.out.println("1.saisie :");
            System.out.println("2.tri :");
            System.out.println("3.afficher :");
            nb = sc.nextInt();

            switch (nb) {
                case 0 -> System.exit(0);
                case 1 -> tri.saisie();
                case 2 -> tri.tri();
                case 3 -> tri.affiche();
                default -> System.out.println("saisie invalide.");
            }
        }
    }
}
