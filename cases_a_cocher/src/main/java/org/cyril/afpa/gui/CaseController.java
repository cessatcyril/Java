package org.cyril.afpa.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

public class CaseController {

    @FXML
    private CheckBox casse;

    @FXML
    private RadioButton casseMajuscule;

    @FXML
    private RadioButton casseMinuscule;

    @FXML
    private TitledPane casseRadio;

    @FXML
    private TitledPane choixCheck;

    @FXML
    private CheckBox couleurFond;

    @FXML
    private CheckBox couleurText;

    @FXML
    private RadioButton fondBleu;

    @FXML
    private TitledPane fondRadio;

    @FXML
    private RadioButton fondRouge;

    @FXML
    private RadioButton fondVert;

    @FXML
    private Label resultat;

    @FXML
    private TextField textInput;

    @FXML
    private RadioButton texteBlanc;

    @FXML
    private RadioButton texteNoir;

    @FXML
    private TitledPane texteRadio;

    @FXML
    private RadioButton texteRouge;

    private String resultatStyle = "";

    @FXML
    void casseMajuscule_cocher(ActionEvent event) {
        resultat.setText( textInput.getText().toUpperCase());
    }

    @FXML
    void casseMinuscule_cocher(ActionEvent event) {
        resultat.setText( textInput.getText().toLowerCase());
    }

    @FXML
    void casse_check(ActionEvent event) {
        if (casseRadio.isDisabled()) {
            casseRadio.setDisable(false);
        } else {
            casseRadio.setDisable(true);
        }
    }

    @FXML
    void couleurFond_check(ActionEvent event) {
        if (fondRadio.isDisabled()) {
            fondRadio.setDisable(false);
        } else {
            fondRadio.setDisable(true);
        }
    }

    @FXML
    void couleurText_check(ActionEvent event) {
        if (texteRadio.isDisabled()) {
            texteRadio.setDisable(false);
        } else {
            texteRadio.setDisable(true);
        }
    }

    @FXML
    void fondBleu_cocher(ActionEvent event) {
        resultatStyle += "-fx-background-color: blue";
        resultat.setStyle(resultatStyle);
    }

    @FXML
    void fondRouge_cocher(ActionEvent event) {
        resultat.setStyle("-fx-background-color: red");
    }

    @FXML
    void fondVert_cocher(ActionEvent event) {
        resultat.setStyle("-fx-background-color: green");

    }

    @FXML
    void texteBlanc_cocher(ActionEvent event) {
        resultat.setStyle("-fx-text-fill: white");
    }

    @FXML
    void texteNoir_cocher(ActionEvent event) {
        resultat.setStyle("-fx-text-fill: black");
    }

    @FXML
    void texteRouge_cocher(ActionEvent event) {
        resultat.setStyle("-fx-text-fill: red");
    }

    @FXML
    void textinput_write(KeyEvent event) {
        choixCheck.setDisable(false);
        getResult();
    }

    @FXML
    public void getResult() {
        resultat.setText(textInput.getText());
    }
}
