package com.company.tool;

public class desCercles {

    public static void premier(int n) {
        Cercles premier = new Cercles();
        premier.setRayon(n);
        System.out.println("la surface est : " + premier.calculSurface());
        System.out.println("Le périmètre est : " + premier.calculCirconference());
    }


}
