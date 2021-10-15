package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n1;
    int n2;
    int nx;
    int nt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le premier nombre : ");
        n1 = sc.nextInt();
        System.out.println("entrer le deuxième nombre : ");
        n2 = sc.nextInt();

        for ( nx = n1 ; nx <= n2; nx++)
        {
            nt += n1;
            n1 +=1;
        }
        System.out.println("la somme de l'intervalle entre les deux valeur est de : " + nt);




    }
}
