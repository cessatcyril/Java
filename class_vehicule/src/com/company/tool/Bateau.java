package com.company.tool;

public class Bateau extends Vehicule{
    public int coque;

    public Bateau(int c) {
        coque = 1;
    }

    @Override
    public String marche() {
        String message = "j'ai " + coque + " coque et je flotte";
        return (String) message;
    }
}
