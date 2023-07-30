package ca.georgian.jl.javaassign.controller;

import ca.georgian.jl.javaassign.model.InsuranceManagementApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerDetailsController {
    @FXML
    private TextArea details;

    @FXML
    private TextField type;

    @FXML
    private TextField cost;

    @FXML
    private TextField payment;

    @FXML
    private TextField account;

    @FXML
    private Button confirmButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;

    @FXML
    private void initialize() {
        // show customer details
        String customerName = "";
        details.setText("Customer Name: " + customerName + "\nCustomer ID: ");
    }


    @FXML
    private void claimSubmit(ActionEvent event) throws IOException {
        String claimType = type.getText();
        String claimCost = cost.getText();
        String claimPayment = payment.getText();
        String claimAccount = account.getText();

        details.setText(String.format("Type: %s\nCost: %s\nPayment: %s\nAccount: %s",
                claimType, claimCost, claimPayment, claimAccount));

        // navigate to claim details page
        SceneController sceneController = new SceneController();
        sceneController.navigateToClaim(event);
    }

    @FXML
    private void cancelPressed() {
        // This method handles what happens when the cancelButton is clicked.
        // For example, you might want to clear all the TextFields:
        type.clear();
        cost.clear();
        payment.clear();
        account.clear();
        details.setText("Cancelled");
    }
}
