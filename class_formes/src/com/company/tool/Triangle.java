package com.company.tool;

public class Triangle extends Forme{
    private float base;
    private float hauteur;

    public Triangle(float b, float h){
        base = b;
        hauteur = h;
    }

    @Override
    public float aire() {
        return (float) (base*hauteur)/2;
    }
}
