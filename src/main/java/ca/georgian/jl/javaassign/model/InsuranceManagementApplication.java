package ca.georgian.jl.javaassign.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InsuranceManagementApplication extends Application {

    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;

        Parent root = FXMLLoader.load(InsuranceManagementApplication.class.getResource("/ca/georgian/jl/javaassign/Signin.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Insurance Management Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
