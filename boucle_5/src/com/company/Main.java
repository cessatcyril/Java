package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nl; //numéro de la ligne
        int n1; //nombre de ligne
        int b1;
        int b2;


        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un nombre");
        n1= sc.nextInt();

        // nombre d'étoile (nl-1)*2+1
        //nombre d'espace n1-nl

        for (nl = 0 ; nl <= n1 ; nl++) {

            StringBuilder b = new StringBuilder();
            for (b1 =0 ; b1< (n1-nl) ; b1++ ) {
                b.append(" ");
            }
            for (b2 =0 ; b2<((nl-1)*2+1); b2++ ) {
                b.append("*");
            }
            System.out.println(b);


        }


    }
}
