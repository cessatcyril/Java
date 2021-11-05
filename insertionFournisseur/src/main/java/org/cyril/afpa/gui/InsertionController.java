package org.cyril.afpa.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.cyril.afpa.tool.Connexion;

import java.sql.*;

public class InsertionController {
    @FXML
    public TextField nomFourni, rueFourni, cpFourni, villeFourni, contactFourni;
    @FXML
    public Button ajouter, annuler;

    private int id;
    private String nom;
    private String rue;
    private String cp;
    private String ville;
    private String contact;


    public void ajouter_clic(ActionEvent actionEvent) {
        Connexion con = new Connexion();
        PreparedStatement stm = null;
        PreparedStatement stm2 = null;
        try {
            stm = con.getConnexion().prepareStatement("INSERT INTO fournis (numfou, nomfou, ruefou, posfou, vilfou, confou) VALUES (?, ?, ?, ?, ?, ?)");
            stm2 = con.getConnexion().prepareStatement("SELECT MAX(numfou) FROM fournis");

            if ((controlText(nomFourni)) & (controlText(rueFourni)) & (controlText(cpFourni)) & (controlText(villeFourni)) & (controlText(contactFourni))) {
                nom = nomFourni.getText();
                rue = rueFourni.getText();
                cp = cpFourni.getText();
                ville = villeFourni.getText();
                contact = contactFourni.getText();

                ResultSet result = stm2.executeQuery();

                while (result.next()) {
                    id = result.getInt("MAX(numfou)");
                    id++;
                    System.out.println(id);
                }


                stm.setInt(1, id);
                stm.setString(2, nom);
                stm.setString(3, rue);
                stm.setString(4, cp);
                stm.setString(5, ville);
                stm.setString(6, contact);

                stm.execute();
                stm.close();
                stm2.close();
                result.close();
                con.getConnexion().close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Le fournisseur est ajouté correctement !");
                alert.show();
            } else {
                controlText(nomFourni);
                controlText(rueFourni);
                controlText(cpFourni);
                controlText(villeFourni);
                controlText(contactFourni);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void annuler_clic(ActionEvent actionEvent) {
        nomFourni.clear();
        rueFourni.clear();
        cpFourni.clear();
        villeFourni.clear();
        contactFourni.clear();
    }


    private boolean controlText(TextField field) {

        String test = field.getText();
        if (test.length() <= 0) {
            borderColor(field, false);
            return false;
        } else {
            borderColor(field, true);
            return true;
        }
    }

    private void borderColor(TextField field, boolean test) {
        if (test) {
            field.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        } else {
            field.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        }
    }


}
