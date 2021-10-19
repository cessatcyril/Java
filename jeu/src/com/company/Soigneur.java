package com.company;

import com.company.comportement.*;

public class Soigneur extends Joueur{

    public Soigneur() {
        this.soin = new PremierSoin();
    }

    public Soigneur(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
