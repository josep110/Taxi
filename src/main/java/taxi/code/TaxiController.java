package taxi.code;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TaxiController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Taxi!");
    }
}