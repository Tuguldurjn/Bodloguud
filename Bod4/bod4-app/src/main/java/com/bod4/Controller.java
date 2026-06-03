package com.bod4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

@FXML
private TextField txtTimeInput;

@FXML
private Label lblSecondsResult;

@FXML
void OnConvertTimeClick(ActionEvent event) {
    try {
        String input = txtTimeInput.getText().trim();
        
        String[] parts = input.split("\\s+");
        
        if (parts.length != 3) {
            lblSecondsResult.setText("Цаг минут секунд дутуу байна!");
            return;
        }
        
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        
        lblSecondsResult.setText(String.valueOf(totalSeconds));
        
    } catch (NumberFormatException e) {
        lblSecondsResult.setText("Зөвхөн бүхэл тоо оруулна уу!");
    }
}
}
