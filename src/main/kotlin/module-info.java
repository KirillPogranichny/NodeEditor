module com.example.nodeeditor {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.nodeeditor to javafx.fxml;
    exports com.example.nodeeditor;
}