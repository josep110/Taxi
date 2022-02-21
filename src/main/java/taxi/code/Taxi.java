package taxi.code;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Taxi extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        TaxiController.loadTitle(stage);

    }

    public static void main(String[] args) {
        launch();
    }

}