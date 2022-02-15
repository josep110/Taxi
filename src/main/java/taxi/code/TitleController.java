package taxi.code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TitleController {

    @FXML
    Button newGame,loadGame;

    public TitleController(){}

    @FXML
    public void newGame() throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("game.fxml"));
        Scene sc = new Scene(root,640,480);
        sc.getStylesheets().add("gameSS.css");

        Stage window = (Stage)newGame.getScene().getWindow();
        window.setScene(sc);
    }

    @FXML
    public void loadGame(){}

    @FXML
    public void quit(){
        javafx.application.Platform.exit();
    }


}