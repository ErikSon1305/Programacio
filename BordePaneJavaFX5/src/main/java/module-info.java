module com.example.bordepanejavafx5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.bordepanejavafx5 to javafx.fxml;
    exports com.example.bordepanejavafx5;
}