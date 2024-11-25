module com.example.spotify_clone {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.spotify_clone to javafx.fxml;
    exports dk.easv.spotify_clone;
    exports dk.easv.spotify_clone.GUI;
    opens dk.easv.spotify_clone.GUI to javafx.fxml;
    exports dk.easv.spotify_clone.GUI.Controller;
    opens dk.easv.spotify_clone.GUI.Controller to javafx.fxml;
}