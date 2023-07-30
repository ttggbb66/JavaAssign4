module ca.georgian.jl.javaassign {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgian.jl.javaassign to javafx.fxml;
    exports ca.georgian.jl.javaassign;
    exports ca.georgian.jl.javaassign.model;
    opens ca.georgian.jl.javaassign.model to javafx.fxml;
}