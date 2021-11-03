package org.cyril.afpa.gui;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.sql.*;
import java.util.ArrayList;

public class JeuDeLigneController {
    @FXML
    public ComboBox<String> fournisseur;
    @FXML
    public TextArea textResultat;
    ArrayList<String> list = new ArrayList<>();
    private int numFournisseur;

    public void choixFournisseur(ActionEvent actionEvent) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/papyrus";
        Connection con = DriverManager.getConnection(url, "silvanol", "4012");


        if (fournisseur.getValue() == "tous") {
            try {
                PreparedStatement stm = con.prepareStatement("SELECT * FROM entcom");
                ResultSet result = stm.executeQuery();
                textResultat.clear();
                while (result.next()) {
                    textResultat.appendText(result.getString("numcom"));
                    textResultat.appendText(" ");
                    textResultat.appendText(result.getString("datcom"));
                    textResultat.appendText(" ");
                    textResultat.appendText(result.getString("obscom"));
                    textResultat.appendText("\n");
                }

                stm.close();
                result.close();
                con.close();

            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.getMessage());
            }
        } else {
            getnumFou(fournisseur.getValue());
            try {

                PreparedStatement stm = con.prepareStatement("SELECT * FROM entcom WHERE numfou=?");

                stm.setInt(1, numFournisseur);

                ResultSet result = stm.executeQuery();
                textResultat.clear();
                while (result.next()) {
                    textResultat.appendText(result.getString("numcom"));
                    textResultat.appendText(" ");
                    textResultat.appendText(result.getString("datcom"));
                    textResultat.appendText(" ");
                    textResultat.appendText(result.getString("obscom"));
                    textResultat.appendText("\n");
                }

                stm.close();
                result.close();
                con.close();

            } catch (Exception e) {
                System.out.println("Error");
                System.out.println(e.getMessage());
            }
        }


    }

    private void getnumFou(String selectedCombo) {
        try {

            String url = "jdbc:mysql://localhost:3306/papyrus";
            Connection con = DriverManager.getConnection(url, "silvanol", "4012");

            PreparedStatement stm = con.prepareStatement("SELECT numfou FROM fournis WHERE nomfou=?");

            stm.setString(1, selectedCombo);

            ResultSet result = stm.executeQuery();

            while (result.next()) {
                numFournisseur = result.getInt("numfou");
            }

            stm.close();
            result.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }

    public void initialize() {
        try {

            String url = "jdbc:mysql://localhost:3306/papyrus";
            Connection con = DriverManager.getConnection(url, "silvanol", "4012");

            Statement stm = con.createStatement();

            ResultSet result = stm.executeQuery("SELECT nomfou FROM fournis");
            list.add("tous");
            while (result.next()) {
                String nom = result.getString("nomfou");
                list.add(result.getString("nomfou"));
            }
            fournisseur.setItems(FXCollections.observableArrayList(list));

            stm.close();
            result.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
