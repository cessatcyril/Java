package com.company;

import com.company.tool.Carre;
import com.company.tool.Cercle;
import com.company.tool.Forme;
import com.company.tool.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Forme[] tableau = { new Carre(2), new Cercle(3), new Carre(5), new Triangle(5,3)};

        String mesFormes = "";

        for (Forme fo: tableau
             ) {
            mesFormes += "||" + fo.aire() + " ||";
        }

        System.out.println(" Surface des formes écrites \n sauvagement dans le code");
        System.out.println(mesFormes);
    }
}
