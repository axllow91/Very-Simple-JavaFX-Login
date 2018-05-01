package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import javax.swing.*;

public class DetailsController {

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label ageLabel;

    @FXML
    private Label professionLabel;

    @FXML
    private Hyperlink detailsEmail;

    @FXML
    private Hyperlink detailsWebsite;

    @FXML
    void initialize() {

    }

//    @FXML
//    void onEmail(ActionEvent event) {
//
//    }
//
//    @FXML
//    void onGoogle(ActionEvent event) {
//
//    }

    void setWelcome(String name) {
        detailsWelcomeLabel.setText("Welcome " + name);
        firstNameLabel.setText("First Name: " + name);
        lastNameLabel.setText("Last Name: TripleAAA");
        ageLabel.setText("Age:" + 9999);
        professionLabel.setText("Profession: Miner");
    }
}
