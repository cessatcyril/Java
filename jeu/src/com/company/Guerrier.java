package com.company;

import com.company.comportement.*;

public class Guerrier extends Joueur{
    public Guerrier() {
        this.espritCombatif = new CombatPistolet();
    }

    public Guerrier(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
