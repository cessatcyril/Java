package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nomSaisie;

        ArrayList<String> tableNom = new ArrayList<>();
        tableNom.add("Jean");
        tableNom.add("Jule");
        tableNom.add("René");
        tableNom.add("Paul");
        tableNom.add("Pierre");
        tableNom.add("Julie");
        tableNom.add("Marrie");
        tableNom.add("George");
        tableNom.add("Thibaut");
        tableNom.add("David");
        tableNom.add("Loic");
        tableNom.add("Jordan");
        tableNom.add("Luca");
        tableNom.add("Marine");
        tableNom.add("Assia");
        tableNom.add("Maelle");
        tableNom.add("Alexa");
        tableNom.add("lisa");
        tableNom.add("Angele");
        tableNom.add("Noemie");

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le nom à effacer :");
        nomSaisie = sc.next();

        tableNom.removeIf(i -> i.equals(nomSaisie));


        for (String i : tableNom) {
            System.out.println(i);
        }
    }
}
