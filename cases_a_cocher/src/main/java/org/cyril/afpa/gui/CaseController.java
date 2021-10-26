package org.cyril.afpa.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import java.util.Locale;
import java.util.regex.Pattern;

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

    private String resultatStyleCasse;

    private String resultatStyleFond ="-fx-background-color: whitesmoke;";

    private String resultatStyleText = "-fx-text-fill: black;";

    @FXML
    void casseMajuscule_cocher(ActionEvent event) {
        resultatStyleCasse = textInput.getText().toUpperCase();
        resultat.setText(resultatStyleCasse);
    }

    @FXML
    void casseMinuscule_cocher(ActionEvent event) {
        resultatStyleCasse = textInput.getText().toLowerCase();
        resultat.setText(resultatStyleCasse);
    }

    @FXML
    void casse_check(ActionEvent event) {
        casseRadio.setDisable(!casseRadio.isDisabled());
        getResult();
    }

    @FXML
    void couleurFond_check(ActionEvent event) {
        fondRadio.setDisable(!fondRadio.isDisabled());
        getResult();
    }

    @FXML
    void couleurText_check(ActionEvent event) {
        texteRadio.setDisable(!texteRadio.isDisabled());
        getResult();
    }

    @FXML
    void fondBleu_cocher(ActionEvent event) {
        resultatStyleFond = "-fx-background-color: blue;";
        getResult();
    }

    @FXML
    void fondRouge_cocher(ActionEvent event) {
        resultatStyleFond = "-fx-background-color: red;";
        getResult();
    }

    @FXML
    void fondVert_cocher(ActionEvent event) {
        resultatStyleFond = "-fx-background-color: green;";
        getResult();

    }

    @FXML
    void texteBlanc_cocher(ActionEvent event) {
        resultatStyleText = "-fx-text-fill: white;";
        getResult();
    }

    @FXML
    void texteNoir_cocher(ActionEvent event) {
        resultatStyleText = "-fx-text-fill: black;";
        getResult();
    }

    @FXML
    void texteRouge_cocher(ActionEvent event) {
        resultatStyleText = "-fx-text-fill: red;";
        getResult();
    }

    @FXML
    void textinput_write(KeyEvent event) {
        choixCheck.setDisable(false);
        resultat.setText(textInput.getText());
    }

    @FXML
    public void getResult() {
        String result = resultatStyleText + resultatStyleFond;
        resultat.setStyle(result);
    }


}
