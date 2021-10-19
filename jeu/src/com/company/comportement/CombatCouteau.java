package com.company.comportement;

public class CombatCouteau implements EspritCombatif{

    @Override
    public void combat() {
        System.out.println("Je combat au couteau.");
    }
}
