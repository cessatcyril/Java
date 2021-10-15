package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nx;
        int nz;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un nombre entier :");
        nz = sc.nextInt();


        for (nx=nz; nx > 0; nx--)
        {
            nz-=1;
            System.out.println(nz);
        }
    }
}
