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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TaxiController {

    @FXML
    Button newGame, loadGame, d1, d2, d3, d4, d5, d6, d7, d8, d0;

    Parent root;
    Scene sc;
    Stage window;

    public TaxiController(){}


    @FXML
    public void loadDistrictView(int no) throws IOException{
        this.root = FXMLLoader.load(Taxi.class.getResource("dis +" + no + ".fxml"));
        this.sc = new Scene(root,640,480);
        this.sc.getStylesheets().add("districtSS.css");
        window = (Stage)newGame.getScene().getWindow();
        window.setScene(sc);
        window.show();
    }
+

    @FXML
    public void onNG() throws IOException{
        City current = new City();
        loadCityView(current);
    }

    @FXML
    public void loadCityView(City c) throws IOException{

        this.root = FXMLLoader.load(Taxi.class.getResource("cityview.fxml"));
        this.sc = new Scene(root,640,480);
        this.sc.getStylesheets().add("citySS.css");
        window = (Stage)newGame.getScene().getWindow();

        sc.addEventFilter(KeyEvent.KEY_PRESSED, ke -> {
            if (ke.getCode() == KeyCode.Q){
                try {
                    loadTitle(window);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        window.setScene(sc);
        window.show();

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
    public void district0() throws IOException{ loadDistrictView(0); }

    @FXML
    public void district1() throws IOException { loadDistrictView(1); }

    @FXML
    public void district2() throws IOException { loadDistrictView(2); }

    @FXML
    public void district3() throws IOException { loadDistrictView(3); }

    @FXML
    public void district4() throws IOException { loadDistrictView(4); }

    @FXML
    public void district5() throws IOException { loadDistrictView(5); }

    @FXML
    public void district6() throws IOException { loadDistrictView(6); }

    @FXML
    public void district7() throws IOException { loadDistrictView(7); }

    @FXML
    public void district8() throws IOException { loadDistrictView(8); }


}