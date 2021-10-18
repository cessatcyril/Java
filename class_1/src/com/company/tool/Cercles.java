package com.company.tool;

public class Cercles {
    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    private int rayon;
    final static double PI=3.1416;



    public double calculSurface(){
        double air = rayon * rayon * PI;
       return air;
    }



    public double calculCirconference() {
         double perimetre = 2 * PI * rayon;
         return perimetre;
    }




}
