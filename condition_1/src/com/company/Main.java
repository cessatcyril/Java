package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int nB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre :");
        nB = sc.nextInt();
        if ( nB % 2 == 0 ) {
            System.out.println("ce nombre est pair");
        } else {
            System.out.println("ce nombre est impair");
        }
    }
}
