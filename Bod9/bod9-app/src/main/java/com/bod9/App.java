package com.bod9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/bod9/triangle.fxml"));
        Parent root = fxmlLoader.load(); 

        Scene scene = new Scene(root, 600, 400); 
        
        stage.setTitle("RGB7120 - Гурвалжин эсэх" + //
                        "");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}