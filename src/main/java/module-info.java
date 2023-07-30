module ca.georgian.jl.javaassign {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgian.jl.javaassign to javafx.fxml;
    exports ca.georgian.jl.javaassign.model;
    exports ca.georgian.jl.javaassign.controller;
    opens ca.georgian.jl.javaassign.model to javafx.fxml;
    opens ca.georgian.jl.javaassign.controller to javafx.fxml;
}