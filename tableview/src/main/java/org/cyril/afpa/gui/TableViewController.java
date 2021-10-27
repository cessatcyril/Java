package org.cyril.afpa.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.cyril.afpa.model.Client;

import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController {

    @FXML
    private Button btn_annuler;

    @FXML
    private Button btn_sauver;

    @FXML
    private Button btn_supprimer;

    @FXML
    private TableColumn<Client, String> col_nom;

    @FXML
    private TableColumn<Client, String> col_prenom;

    @FXML
    private TableColumn<Client, String> col_ville;

    @FXML
    private TableView<Client> lst_clients;

    @FXML
    private TextField txt_nom;

    @FXML
    private TextField txt_prenom;

    @FXML
    private TextField txt_ville;

    private ObservableList<Client> model = FXCollections.observableArrayList();


    public void initialize() {
        //initialisation du modèle
        model.add(new Client("Josh", "Homme", "Joshua Tree"));
        model.add(new Client("Dave", "Grohl", "Warren"));
        model.add(new Client("Krist", "Novoselic", "Compton"));
        model.add(new Client("Robert", "Trujillo", "Santa Monica"));
        //On rend le tableau non-éditable
        lst_clients.setEditable(false);

        // Jonction du tableau avec les données
        col_prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        col_nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        col_ville.setCellValueFactory(new PropertyValueFactory<>("ville"));

        // On indique au TableView quelle modèle observer pour trouver les données
        lst_clients.setItems(model);

    }

    @FXML
    public void sauver(ActionEvent actionEvent) {
        model.add(new Client(txt_prenom.getText(),txt_nom.getText(),txt_ville.getText()));
    }

    @FXML
    public void annuler(ActionEvent actionEvent) {
        txt_nom.clear();
        txt_prenom.clear();
        txt_ville.clear();
    }

    @FXML
    public void supprimer(ActionEvent actionEvent) {
        try {
            model.remove(lst_clients.getSelectionModel().getSelectedIndex());
        }catch (Exception e){}

    }
}
