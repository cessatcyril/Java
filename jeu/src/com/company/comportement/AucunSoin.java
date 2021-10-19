package com.company.comportement;

public class AucunSoin implements Soin{
    @Override
    public void soigner() {
        System.out.println("Je ne soigne pas.");
    }
}
