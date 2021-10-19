package com.company;

import com.company.comportement.Operation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Joueur[] tJoueur = {new Guerrier(), new Civil(), new Soigneur(), new Chirurgien()};
        for (Joueur joueur : tJoueur) {
            System.out.println("\nInstance de: " + joueur.getClass().getName());
            System.out.println("=============================");
            joueur.combat();
            joueur.deplace();
            joueur.soigner();

        }
        System.out.println("==============================");
        Joueur jules = new Guerrier();
        jules.soigner();
        jules.setSoin(new Operation());
        jules.soigner();
    }
}
