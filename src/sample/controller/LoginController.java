package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private JFXTextField loginUsername;

    @FXML
    private JFXPasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {
        loginButton.setOnAction(event -> loginUser());
    }

    private void loginUser() {


        // Get the main  window
        loginButton.getScene().getWindow().hide();

        // if the user and password labels
        // are not empty
        if(!loginUsername.getText().trim().equals("") &&
                !loginPassword.getText().trim().equals("")) {
            // we are ready to go
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/details.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            DetailsController detailsController = loader.getController();
            detailsController.setWelcome(loginUsername.getText());

            stage.show();
        }
    }
}
