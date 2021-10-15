package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> maliste = new ArrayList<>();
        String sT = "1";
        int nB;


        while (!sT.equals("0")) {
            System.out.println("entrer la valeur (0 pour arreter)");
            sT = sc.next();
            if (!sT.equals("0")) {
                maliste.add(sT);
            }
        }

        System.out.println("L'arrayListe contient : ");
        for (nB =0 ; nB < maliste.size() ; nB++) {
            System.out.println(maliste.get(nB));
        }
    }
}
