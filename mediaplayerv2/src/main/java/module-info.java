module com.example.mediaplayerv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.mediaplayerv2 to javafx.fxml;
    exports com.example.mediaplayerv2;
}