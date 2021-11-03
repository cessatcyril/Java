package org.cyril.afpa.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.*;
import java.util.regex.Pattern;

public class ViewController {
    @FXML
    public TextField recherche, nomFourni, adresseFourni, CodePostalFourni, villeFourni, contactFourni, erreur;
    @FXML
    public Button btnRecherche;


    public void selectFournisseur(ActionEvent actionEvent) {
        String test = recherche.getText();
        if ((test.matches("[0-9]+")) & (test.length() < 5)) {
            try {

                String url = "jdbc:mysql://localhost:3306/papyrus";
                Connection con = DriverManager.getConnection(url, "silvanol", "4012");

                PreparedStatement stm = con.prepareStatement("SELECT * FROM fournis WHERE numfou=?");

                stm.setInt(1, Integer.parseInt(test));

                ResultSet result = stm.executeQuery();
                if (result.next()) {
                    erreur.clear();
                        nomFourni.setText(result.getString("nomfou"));
                        adresseFourni.setText(result.getString("ruefou"));
                        CodePostalFourni.setText(result.getString("posfou"));
                        villeFourni.setText(result.getString("vilfou"));
                        contactFourni.setText(result.getString("confou"));
                } else {
                    nomFourni.clear();
                    erreur.clear();
                    erreur.setText("aucun résulat trouvé");
                    adresseFourni.clear();
                    CodePostalFourni.clear();
                    villeFourni.clear();
                    contactFourni.clear();
                }
                stm.close();
                result.close();
                con.close();

            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.getMessage());
            }
        } else {
            nomFourni.clear();
            erreur.clear();
            erreur.setText("entrer un numero de 1 à 4 chiffres uniquement.");
            adresseFourni.clear();
            CodePostalFourni.clear();
            villeFourni.clear();
            contactFourni.clear();
        }

    }
}
