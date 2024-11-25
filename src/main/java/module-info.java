module com.example.spotify_clone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spotify_clone to javafx.fxml;
    exports com.example.spotify_clone;
}