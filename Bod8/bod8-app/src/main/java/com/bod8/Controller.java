package com.bod8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtThreeNumbers;

    @FXML
    private Label lblMaxResult;

    @FXML
    void OnFindMaxClick(ActionEvent event) {
        try {
            String input = txtThreeNumbers.getText().trim();
            String[] parts = input.split("\\s+");
            
            if (parts.length != 3) {
                lblMaxResult.setText("3 тоог зайгаар тусгаарлаж оруулна уу!");
                return;
            }
            
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            int num3 = Integer.parseInt(parts[2]);
            
            int maxVal = Math.max(num1, Math.max(num2, num3));
            
            lblMaxResult.setText(String.valueOf(maxVal));
            
        } catch (NumberFormatException e) {
            lblMaxResult.setText("Буруу утга! Бүхэл тоо оруулна уу.");
        }
    }
}
