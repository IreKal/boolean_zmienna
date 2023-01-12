package com.example.boolean_zmienna;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b jest " + b);
        b = true;
        System.out.println("b jest " + b);
        if ( b )  { System.out.println("to wywolanie  zostalo wykonane");}
        b = false;
        if ( b )  { System.out.println("to wywolanie nie zostalo wykonane");}
        System.out.println("10 > 9  " + (10 > 9));
    }
}