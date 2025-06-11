package com.example.finalgettingready;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Clock;
import java.util.concurrent.Flow;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
    Text text = new Text(20,20,"Hello, World!");

    text.setOnMouseDragged(mouseEvent -> {
        text.setX(mouseEvent.getX());
        text.setY(mouseEvent.getY());
    });
        Pane Pane = new Pane();
        Pane.getChildren().add(text);

    Scene scene = new Scene(Pane,500,100);
    stage.setScene(scene);
    stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
