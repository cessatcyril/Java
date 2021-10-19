package com.company;

import com.company.comportement.*;

public class Chirurgien extends Joueur{
    public Chirurgien() {
        this.soin = new Operation();
    }
    public Chirurgien(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
