package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client {
    private String prenom;
    private String nom;
    private String id;

    public Client(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        id = genIn();
    }

    private String genIn() {
        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(date);   // assigns calendar to given date
        String heure = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        return nom.substring(0,2).toUpperCase()+heure+prenom.substring(0,2).toUpperCase();
    }

    public String getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
