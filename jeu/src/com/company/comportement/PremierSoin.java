package com.company.comportement;

public class PremierSoin implements Soin{
    @Override
    public void soigner() {
        System.out.println("Je fais les premiers soin.");
    }
}
