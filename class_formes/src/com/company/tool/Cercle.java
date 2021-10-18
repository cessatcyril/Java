package com.company.tool;

public class Cercle extends Forme {

    private float rayon;

    public Cercle(float r)
    {
        rayon =r;
    }
    public float aire() {
        return (float) (Math.PI*Math.pow(rayon,2));
    }
}
