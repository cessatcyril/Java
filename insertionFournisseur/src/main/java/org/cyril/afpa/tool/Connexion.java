package org.cyril.afpa.tool;

import java.sql.*;

public class Connexion {

private Connection connexion;

    public Connexion() {
        connexion = seConecter();
    }


    private Connection seConecter() {
        String url = "jdbc:mysql://localhost:3306/papyrus";
        try {
            Connection con = DriverManager.getConnection(url, "silvanol", "4012");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getConnexion() {
        return connexion;
    }
}
