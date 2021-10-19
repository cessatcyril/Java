package com.company.comportement;

public class Pacifiste implements EspritCombatif{
    @Override
    public void combat() {
        System.out.println("Je ne combat pas.");
    }
}
