package edu.stevens.friccobo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class AppFxml  extends Application {
    @Override
    public void start(Stage stage) throws IOException  {
        Parent load = FXMLLoader.load(getClass().getResource("/Counter.fxml"));
        Scene scene = new Scene(load, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
