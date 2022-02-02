module com.example.taxi {
    requires javafx.controls;
    requires javafx.fxml;


    opens taxi.code to javafx.fxml;
    exports taxi.code;
}