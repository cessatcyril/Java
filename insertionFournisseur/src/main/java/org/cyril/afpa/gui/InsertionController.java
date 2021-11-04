package org.cyril.afpa.gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        try {
            stm = con.getConnexion().prepareStatement("INSERT INTO fournis (numfou, nomfou, ruefou, posfou, vilfou, confou) VALUES (?, ?, ?, ?, ?, ?)");

            stm.setInt(1, 666);
            stm.setString(2, "aa");
            stm.setString(3, "bb");
            stm.setString(4, "cc");
            stm.setString(5, "dd");
            stm.setString(6, "ee");

            stm.execute();
            stm.close();
            con.getConnexion().close();

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

    public void initialize() {
        controlText(nomFourni);
        controlText(rueFourni);
        controlText(cpFourni);
        controlText(villeFourni);
        controlText(contactFourni);
    }

    private void controlText(TextField field) {

        field.textProperty().addListener(evt -> {
            String test = field.getText();
            if (test.length() <= 0) {
                borderColor(field, false);
            } else {
                borderColor(field, true);
            }

        });
    }

    private void borderColor(TextField field, boolean test) {
        if (test) {
            field.setBorder(new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        } else {
            field.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        }
    }


}
