package taxi.code;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Taxi extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Taxi.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        City test = new City();
        test.printDistricts();
    }

    public static void main(String[] args) {
        launch();
    }
}