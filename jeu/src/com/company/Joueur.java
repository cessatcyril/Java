package com.company;

import com.company.comportement.*;

public abstract class Joueur {

    //instance de comportement
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();

    //Constructeur par défaut

    /**
     * constructeur par defaut
     */
    public Joueur() {
    }

    //Constructeur avec paramètres

    /**
     * constructeur avec parametres
     * @param espritCombatif definit le comportement de combat
     * @param soin definit le comportement de soin
     * @param deplacement definit le comportement de déplacement
     */
    public Joueur(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement) {
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    //Methode de déplacement de Joueur

    /**
     * Méthode de déplacement
     */
    public void deplace() {
        deplacement.deplace();
    }

    //Méthode que les combattants utilisent

    /**
     * Méthode de combat
     */
    public void combat() {
        espritCombatif.combat();
    }

    //Méthode de soin

    /**
     * Méthode de soin
     */
    public void soigner() {
        soin.soigner();
    }
    //Redéfinit le comportement au combat

    /**
     * setter
     * @param espritCombatif definit le comportement de combat
     */
    public void setEspritCombatif(EspritCombatif espritCombatif){
        this.espritCombatif = espritCombatif;
    }
    //    Redéfinit le comportement de soin

    /**
     * setter
     * @param soin definit le comportement de soin
     */
    public void setSoin(Soin soin){
        this.soin = soin;
    }
    //redéfinit le comportement de déplacement

    /**
     *setter
     * @param deplacement definit le comportement de déplacement
     */
    public void setDeplacement(Deplacement deplacement){
        this.deplacement = deplacement;
    }
}
