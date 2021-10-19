package com.company.tool;

public class Livre {
    private String titre;
    private String nom;
    private String prenom;
    private String categorie;
    private String isbn;
    private String code;


    public Livre(String t, String n, String p, String c, String i) {
        titre = t;
        nom = n;
        prenom = p;
        categorie = c;
        isbn = i;
        code = calculerLeCode();
    }

    public void afficheUnLivre() {
        System.out.println("Le titre du livre est : " + titre);
        System.out.println("Le nom de l'auteur est : " + nom);
        System.out.println("Le prenom de l'auteur est : " + prenom);
        System.out.println("La catégorie est : " + categorie);
        System.out.println("Le numero ISBN est : " + isbn);
        System.out.println("Le code du livre est : " + code);
    }

    public String calculerLeCode() {
        String resultat;
        String[] test = isbn.split("-");
        String is = "";
        for (String i : test
        ) {
            is += i;
        }
        resultat = nom.substring(0, 2) + prenom.substring(0, 2) + categorie.substring(0, 2) + is.substring(11, 13);
        return resultat;
    }
}