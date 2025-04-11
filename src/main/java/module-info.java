module com.adrian {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.adrian to javafx.fxml;
    opens com.adrian.vista to javafx.fxml; 
    opens com.adrian.controlador to javafx.fxml; 

    exports com.adrian;
    exports com.adrian.vista; 
    exports com.adrian.controlador; 
}