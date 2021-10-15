package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String n;
    double n1;
    double n2;
    double nT;

    Scanner sc = new Scanner(System.in);

    System.out.println("Entrer le premier nombre :");
    n1 = sc.nextDouble();

    System.out.println("Entrer le signe arythmétique ( + - / *)");
    n= sc.next();

    System.out.println("Entrer le deuxième nombre :");
    n2 = sc.nextDouble();



        if (n.equals("+") || n.equals("-") || n.equals("*") || n.equals("/")) {
            switch (n) {
                case "+" :
                    nT = n1 + n2;
                    System.out.println("le résultat est : " + nT);
                    break;
                case "-" :
                    nT = n1 - n2;
                    System.out.println("le résultat est : " + nT);
                    break;
                case "*" :
                    nT = n1 * n2;
                    System.out.println("le résultat est : " + nT);
                    break;
                case "/" :
                    if (n2 != 0) {
                        nT = n1 / n2;
                        System.out.println("le résultat est : " + nT);
                    } else {
                        System.out.println("la division est impossible");
                    }break;
            }
        } else { System.out.println("Le signe de calcul doit être +, -, * ou /");

    }
    }
}
