package com.example.final2;

import javafx.application.Application;
import javafx.application.Platform;
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
String textt = "Hello and Welcome!";
    @Override
    public void start(Stage stage) throws IOException {


        Text text = new Text(20,20,"Hello and Welcome");
        Pane pane = new Pane();
        pane.getChildren().add(text);
        new Thread(()->{

    try{
        while (true) {
    if (textt.trim().length() == 0) textt = "Hello and Welcome";
    else textt = "";


    Platform.runLater(() -> text.setText(textt));
        Thread.sleep(500);


    }
    } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        }).start();

        Scene scene = new Scene(pane,500,200);
        stage.setScene(scene);
        stage.show();
        text.requestFocus();
    }
    public static void main(String[] args) {
        launch();
    }
}

