package com.company.tool;

public class Carre extends Forme {
    private float cote;

    public Carre(float c) {
        cote = c;
    }

    public float aire() {
        return (float) Math.pow(cote, 2);
    }
}
