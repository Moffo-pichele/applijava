module com.example.demo11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.demo11 to javafx.fxml;
    exports com.example.demo11;
}