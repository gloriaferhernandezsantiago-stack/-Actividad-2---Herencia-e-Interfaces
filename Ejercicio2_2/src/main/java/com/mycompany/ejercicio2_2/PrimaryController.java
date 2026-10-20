package com.mycompany.ejercicio2_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label txtResultado;

    @FXML
    private void btnMostrar_click() {
        Figura2D f = new TrianguloRect(3, 4);
        String res1 = f.imprimeFigura();

        f = new Circulo(3);
        String res2 = f.imprimeFigura();

        String resultadoFinal = res1 + "\n\n" + res2;

        txtResultado.setText(resultadoFinal);

        System.out.println(res1);
        System.out.println(res2);
    }
}