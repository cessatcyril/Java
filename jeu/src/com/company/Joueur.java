package com.company;

import com.company.comportement.*;

public abstract class Joueur {

    //instance de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();

    //Constructeur par défaut
    public Joueur() {
    }

    //Constructeur avec paramètres
    public Joueur(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    //Methode de déplacement de Joueur
    public void deplace() {
        deplacement.deplace();
    }

    //Méthode que les combattants utilisent
    public void combat() {
        espritCombatif.combat();
    }

    //Méthode de soin
    public void soigner() {
        soin.soigner();
    }
    //Redéfinit le comportement au combat
    public void setEspritCombatif(EspritCombatif espritCombatif){
        this.espritCombatif = espritCombatif;
    }
    //    Redéfinit le comportement de soin
    public void setSoin(Soin soin){
        this.soin = soin;
    }
    //redéfinit le comportement de déplacement
    public void setDeplacement(Deplacement deplacement){
        this.deplacement = deplacement;
    }
}
