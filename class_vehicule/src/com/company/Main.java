package com.company;

import com.company.tool.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicule[] table = new Vehicule[] { new Camion(6), new Velo(2), new Avion(2), new Bateau(1)
        };
String resultat="";
        for (Vehicule ve: table
             ) {
            resultat += "\n" + ve.marche() + "\n";
        }

        System.out.println("table des marches :");
        System.out.println(resultat);



    }
}
