package com.mvc.view;

import com.mvc.controller.DateController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DateScreen extends Application {

    @Override
    public void start (Stage stage){
        stage.setTitle("Inform right date");

        Button btn = new Button();
        btn.setOnAction (new EventHandler<ActionEvent>() {

          public void handle (ActionEvent event) {
               DateController dateController = new DateController();
               System.out.println("The current date is: " + dateController.getRightDate());

            }
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(btn);
        stage.setScene(new Scene(root,300,250));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
