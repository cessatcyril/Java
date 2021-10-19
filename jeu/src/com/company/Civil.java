package com.company;

import com.company.comportement.*;

public class Civil extends Joueur {

    public Civil() {
        this.deplacement = new Courir();
    }

    public Civil(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        super(espritCombatif, soin, deplacement);
    }
}
