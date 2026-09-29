module com.example.lab_prueba {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab_prueba to javafx.fxml;
    exports com.example.lab_prueba;
}