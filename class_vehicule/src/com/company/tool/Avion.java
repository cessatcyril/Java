package com.company.tool;

public class Avion extends Vehicule{
    public int aile;

    public Avion(int a) {
        aile = a;
    }

    @Override
    public String marche() {
        String message = "j'ai " + aile + " aile et je vole";
        return (String) message;
    }
}
