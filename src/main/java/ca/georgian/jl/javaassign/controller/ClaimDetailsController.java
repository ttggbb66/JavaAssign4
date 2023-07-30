package ca.georgian.jl.javaassign.controller;

import ca.georgian.jl.javaassign.model.InsuranceManagementApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class ClaimDetailsController {
    @FXML
    private TextArea detailDisplay;

    @FXML
    private Button confirmButton;

    @FXML
    private Button returnButton;

    @FXML
    private void initialize() {
        // This method is called by the FXMLLoader when initialization is complete
    }

    @FXML
    private void claimConfirm() {
        detailDisplay.setText("Claim Detail:");
    }

    @FXML
    private void returnToSecond(ActionEvent event) throws IOException {
        // This method handles what happens when the returnButton is clicked.
        // For example, you might want to clear the detailDisplay:
        detailDisplay.clear();
        SceneController sceneController = new SceneController();
        sceneController.navigateToCustomer(event);
    }

}
