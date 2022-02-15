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

        Parent root = FXMLLoader.load(Taxi.class.getResource("title.fxml"));
        Scene sc = new Scene(root,640,480);
        sc.getStylesheets().add("titleSS.css");

        stage.setTitle("Taxi! - Taxi Management Sim");
        stage.setResizable(false);

        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}