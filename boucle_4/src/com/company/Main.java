package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
String s;
String v;
int n;
int t = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("taper un mot");
        s = sc.next();



for (n = 0 ; n < s.length() ; n++ ) {
    v = s.substring(n ,n+1);
    if (v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u") || v.equals("y") ) {
        t++;
    }
}
        System.out.println("il y a " + t + " voyelle dans ce mot.");
    }
}
