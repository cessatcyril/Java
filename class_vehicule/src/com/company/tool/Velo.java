package com.company.tool;

public class Velo extends Vehicule{
    public int roue;

    public Velo(int r) {
        roue = r;
    }

    @Override
    public String marche() {
        String message = "j'ai " + roue + " roues et je roule";
        return (String) message;
    }
}
