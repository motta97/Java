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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Clock;
import java.util.concurrent.Flow;

public class HelloApplication extends Application {
    private CirclePane circlePane = new CirclePane();
    @Override
    public void start(Stage stage) throws IOException {
VBox vBox = new VBox();
HBox hBox = new HBox();
Button buttonEn  = new Button("Enlarge");
Button buttonSh = new Button("Shrink");
vBox.getChildren().add(circlePane);
hBox.getChildren().addAll(buttonEn,buttonSh);
vBox.getChildren().add(hBox);
hBox.setAlignment(Pos.CENTER);
vBox.setAlignment(Pos.CENTER);
vBox.setSpacing(50);
buttonEn.setOnAction(event -> circlePane.enlarge());
buttonSh.setOnAction(event -> circlePane.shrink());
Scene scene = new Scene(vBox,500,200);
stage.setScene(scene);
stage.show();





    }
    class CirclePane extends StackPane{
        Circle circle = new Circle(50);
       public CirclePane(){
           getChildren().add(circle );
           circle.setFill(Color.WHITE);
           circle.setStroke(Color.BLACK);
       }
        public void enlarge(){

            circle.setRadius(circle.getRadius()+2);

        }
        public void shrink  (){
            circle.setRadius(circle.getRadius()>2?circle.getRadius()-2:circle.getRadius());
        }


    }
    class EnlargeHandler implements EventHandler<ActionEvent>{

        public void handle(ActionEvent event){
            circlePane.enlarge();
        }


    }
    class ShrinkHandler implements EventHandler<ActionEvent>{

        public void handle(ActionEvent event){
            circlePane.shrink();
        }


    }

    public static void main(String[] args) {
        launch();
    }
}
