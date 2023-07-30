package ca.georgian.jl.javaassign.controller;

import ca.georgian.jl.javaassign.model.InsuranceManagementApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SigninController {

    @FXML
    public TextField idCustomer;

    @FXML
    public TextField pswCustomer;

    @FXML
    public Button signinButton;

    @FXML
    private void initialize() {}

    @FXML
    void signin(ActionEvent event) throws IOException {
        // check with sql query

        // route to customer details page
        SceneController sceneController = new SceneController();
        sceneController.navigateToCustomer(event);
    }
}
