package org.cyril.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/cyril/afpa/gui/Case.fxml"));
// 2
        Scene scene = new Scene(root);
// 3
        primaryStage.setScene(scene);
// 4
        primaryStage.show();
    }
}
