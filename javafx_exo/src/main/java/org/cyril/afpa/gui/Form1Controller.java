package org.cyril.afpa.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.regex.Pattern;

public class Form1Controller {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button calculer;

    @FXML
    private TextArea textAfficher;

    @FXML
    private Button vider;

    private int calcul = 0;

    @FXML
    void btn_click(ActionEvent event) {
        String reg = ".*=.*";
        boolean matches = Pattern.matches(reg, textAfficher.getText());
        String name = event.getTarget().toString();
        String bouton = name.substring(name.length() - 2, name.length() - 1);

        if (matches) {
            textAfficher.clear();
            textAfficher.appendText(String.valueOf(calcul));
        }
        textAfficher.appendText("+" + bouton);
        calcul += Integer.parseInt(bouton);

    }

    @FXML
    void calculer_click(ActionEvent event) {
        textAfficher.appendText("=" + calcul);
    }

    @FXML
    void vider_click(ActionEvent event) {
        textAfficher.clear();
        calcul = 0;
    }

}
