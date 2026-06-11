package com.bod7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/bod7/shagai.fxml"));
        Parent root = fxmlLoader.load(); 

        Scene scene = new Scene(root, 600, 400); 
        
        stage.setTitle("RGB7090 - Шагай 1\r\n" + //
                        "");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}