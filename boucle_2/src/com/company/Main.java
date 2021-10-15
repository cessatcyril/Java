package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nx;
        int nz;
        int nt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un nombre entier :");
        nz = sc.nextInt();


        for (nx=nz; nx > 0; nx--)
        {
            nz-=1;
            nt += nz;
        }
        System.out.println(nt);
    }
}
