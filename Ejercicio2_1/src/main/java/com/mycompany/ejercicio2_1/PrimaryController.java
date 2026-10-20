package com.mycompany.ejercicio2_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label txtResultado; 

    @FXML
    private void btnMostrar_click() {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008800);

        String resultado = a.toString() + "\n" + p.toString();
        
        txtResultado.setText(resultado);
        
        System.out.println(a);
        System.out.println(p);
    }
}