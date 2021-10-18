package com.company.tool;


import java.util.Arrays;
import java.util.Scanner;

public class TriNombre {

    Scanner sc = new Scanner(System.in);
    private int taille;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int[] getTable() {
        return table;
    }

    public void setTable(int[] table) {
        this.table = table;
    }

    private int[] table;

    public void saisie() {
        System.out.println("entrer la taille du tableau :");
        taille = sc.nextInt();
        table = new int[taille];
        for (int i = 0; i < taille; i++) {
            System.out.println("entrer la valeur à enregistrer : ");
            table[i] = sc.nextInt();
        }
    }

    public void tri() {
        if (table != null) {
        Arrays.sort(table);
            System.out.println("Le tableau a été trier avec succès");
        } else {
            System.out.println("Le tableau est vide et ne peut pas être trier");
        }
    }


    public void affiche() {
        if (table != null) {
        System.out.println("Voici le tableau :");
        for (Integer i : table
        ) {
            System.out.println(i);
        }} else {
            System.out.println("Le tableau est vide.");
        }
    }


}
