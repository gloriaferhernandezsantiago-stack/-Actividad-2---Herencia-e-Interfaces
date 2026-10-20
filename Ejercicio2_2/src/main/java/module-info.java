module com.mycompany.ejercicio2_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio2_2 to javafx.fxml;
    exports com.mycompany.ejercicio2_2;
}
