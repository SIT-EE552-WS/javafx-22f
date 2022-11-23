package edu.stevens.friccobo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
//        var javaVersion = SystemInfo.javaVersion();
//        var javafxVersion = SystemInfo.javafxVersion();
//
        AtomicInteger i =  new AtomicInteger();
        Label label = new Label(String.valueOf(i));
        Button button = new Button("Count");
        button.setOnAction( event -> {
            label.setText(String.valueOf(i.incrementAndGet()));
        });

        HBox hBox = new HBox();
        hBox.getChildren().add(label);
        hBox.getChildren().add(button);

        var scene = new Scene(hBox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}