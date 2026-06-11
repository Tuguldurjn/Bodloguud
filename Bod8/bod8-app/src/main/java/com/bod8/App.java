package com.bod8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/bod8/maxThree.fxml"));
        Parent root = fxmlLoader.load(); 

        Scene scene = new Scene(root, 600, 400); 
        
        stage.setTitle("RGB7103 - 3 тооны их" + //
                        "");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}