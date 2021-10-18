package com.company.tool;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;

    public Client(String n, String p, String a, String v) {
        nom = n;
        prenom = p;
        adresse = a;
        ville = v;
    }

    public Client(String n, String p, String v) {
        nom = n;
        prenom = p;
        adresse = "";
        ville = v;
    }

    public String toString() {
        return "Prenom : " + this.prenom + ", nom : " + this.nom + ", adresse : " + this.adresse + ", ville : " + this.ville + "\n";
    }
}
