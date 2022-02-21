package taxi.code;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class TaxiController {

    @FXML
    Button newGame, loadGame, d1, d2, d3, d4, d5, d6, d7, d8, d9;

    Parent root;
    Scene sc;
    Stage window;

    public TaxiController(){}

    @FXML
    public void loadDistrictView() throws IOException{
        this.root = FXMLLoader.load(Taxi.class.getResource("districtview.fxml"));
        this.sc = new Scene(root,640,480);
        this.sc.getStylesheets().add("districtSS.css");


    }


    @FXML
    public void loadCityView() throws IOException{

        this.root = FXMLLoader.load(Taxi.class.getResource("cityview.fxml"));
        this.sc = new Scene(root,640,480);
        this.sc.getStylesheets().add("citySS.css");
        window = (Stage)newGame.getScene().getWindow();

        sc.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){
            public void handle(KeyEvent ke){
                if (ke.getCode() == KeyCode.Q){
                    try {
                        loadTitle(window);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        window.setScene(sc);
    }

    public static void loadTitle(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(Taxi.class.getResource("title.fxml"));
        Scene sc = new Scene(root,640,480);
        sc.getStylesheets().add("titleSS.css");

        stage.setTitle("Taxi! - Taxi Management Sim");
        stage.setResizable(false);

        stage.setScene(sc);
        stage.show();
    }

    @FXML
    public void loadGame(){}

    @FXML
    public void quit(){
        javafx.application.Platform.exit();
    }

    @FXML
    public void district(){
        System.out.println("district selected");
    }

}