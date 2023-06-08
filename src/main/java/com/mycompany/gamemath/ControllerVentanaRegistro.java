package com.mycompany.gamemath;

import com.mycompany.gamemath.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class ControllerVentanaRegistro {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("VentanaInicial");
    }
}