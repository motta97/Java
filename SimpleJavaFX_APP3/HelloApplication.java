package com.example.final2;

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


        Text text = new Text(20,20,"A");
        Pane pane = new Pane();
        pane.getChildren().add(text);

        text.setOnKeyPressed( e->{
            switch (e.getCode()){

                case UP: text.setY(text.getY()-10);break;
                case DOWN: text.setY(text.getY()+10);break;
                case RIGHT: text.setX(text.getX()+10);break;
                case LEFT: text.setX(text.getX()-10);break;

            }



        });

        Scene scene = new Scene(pane,500,200);
        stage.setScene(scene);
        stage.show();
        text.requestFocus();
    }
    public static void main(String[] args) {
        launch();
    }
}
