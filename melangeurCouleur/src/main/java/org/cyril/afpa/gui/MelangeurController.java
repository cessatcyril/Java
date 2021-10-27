package org.cyril.afpa.gui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

public class MelangeurController {

    @FXML
    private Pane colorBlue;

    @FXML
    private Pane colorGreen;

    @FXML
    private Pane colorRed;

    @FXML
    private Pane colorTotal;

    @FXML
    private Slider sliderGreen;

    @FXML
    private Slider sliderRed;

    @FXML
    private Slider sliderBlue;

    private int red = 0;
    private int green = 0;
    private int blue = 0 ;


    public void initialize() {
        colorRed.setStyle("-fx-background-color: rgb(0,0,0);");
        colorGreen.setStyle("-fx-background-color: rgb(0,0,0);");
        colorBlue.setStyle("-fx-background-color: rgb(0,0,0);");
        colorTotal.setStyle("-fx-background-color: rgb(0,0,0);");
        sliderRed.setMin(0);
        sliderRed.setMax(255);
        sliderGreen.setMin(0);
        sliderGreen.setMax(255);
        sliderBlue.setMin(0);
        sliderBlue.setMax(255);

        sliderRed.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<?extends Number> slider, Number avant, Number apres) {
                red = apres.intValue();
                style(colorRed,red,0,0);
                style(colorTotal, red, green, blue);
            }
        });

        sliderGreen.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<?extends Number> slider, Number avant, Number apres) {
                green = apres.intValue();
                style(colorGreen,0,green,0);
                style(colorTotal, red, green, blue);
            }
        });

        sliderBlue.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<?extends Number> slider, Number avant, Number apres) {
                blue = apres.intValue();
                style(colorBlue,0,0,blue);
                style(colorTotal, red, green, blue);
            }
        });
    }

    /**
     * definie la couleur de bacground d'un pane
     * @param pane le pane cibler
     * @param red la couleur rouge (0-255)
     * @param green la couleur verte (0-255)
     * @param blue la couleur bleu (0-255)
     */
    public void style(Pane pane, int red, int green, int blue) {
        String style = "-fx-background-color: rgb(" + red + "," + green +"," + blue + ");";
        pane.setStyle(style);
    }


}
