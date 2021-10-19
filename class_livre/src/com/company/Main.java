package com.company;

import com.company.tool.Livre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String titre;
        String nom;
        String prenom;
        String categorie;
        String isbn = "";


        System.out.println("entrer le titre du livre :");
        titre = sc.nextLine();
        System.out.println("entrer le nom de l'auteur :");
        nom = sc.next();
        System.out.println("entrer le prenom de l'auteur :");
        prenom = sc.next();
        System.out.println("entrer la catégorie du livre :");
        sc.nextLine();
        categorie = sc.nextLine();
        while (isbn.length() != 17) {
            System.out.println("entrer l'ISBN à 17 charactere du livre :");
            isbn = sc.next();
        }
        Livre livrePoche = new Livre(titre, nom, prenom, categorie, isbn);

        livrePoche.afficheUnLivre();

    }
}
