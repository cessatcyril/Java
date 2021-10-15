package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int nB;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer votre année de naissance");
        nB = sc.nextInt();

        nB = 2021 - nB;

        if (nB < 18) {
            System.out.println("Vous avez " + nB + " ans et êtes mineur.");
        } else {
            System.out.println("Vous avez " + nB + " ans et êtes majeur.");
        }

    }
}
