package org.cyril.afpa.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VelvetController {
    @FXML
    public Label titreAlb, auteurAlb;
    @FXML
    public ImageView pochetteAlb;

    public void initialize() {
        titreAlb.setText("Dirt");
        auteurAlb.setText("Alice in Chains");
        Image image = new Image(String.valueOf(getClass().getResource("pictures/Dirt.jpeg")));
        pochetteAlb.setImage(image);
    }
}
