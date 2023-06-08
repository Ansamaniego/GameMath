package com.mycompany.gamemath;

import com.mycompany.gamemath.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class ControllerVentanaInicial {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("VentanaRegistro");
    }
}
