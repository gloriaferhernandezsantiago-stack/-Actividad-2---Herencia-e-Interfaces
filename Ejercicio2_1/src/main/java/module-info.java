module com.mycompany.ejercicio2_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio2_1 to javafx.fxml;
    exports com.mycompany.ejercicio2_1;
}
