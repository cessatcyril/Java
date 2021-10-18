package com.company.tool;

public class Camion extends Vehicule {

    public int roue;

    public Camion(int r) {
        roue = r;
    }

    @Override
    public String marche() {
String message = "j'ai " + roue + " roues et je roule";
        return (String) message;
    }
}
