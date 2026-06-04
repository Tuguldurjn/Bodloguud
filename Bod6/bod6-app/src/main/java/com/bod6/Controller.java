package com.bod6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtSumLimit;

    @FXML
    private Label lblSumResult;

    @FXML
    void OnCalculateSumClick(ActionEvent event) {
        try {
            long n = Long.parseLong(txtSumLimit.getText().trim());
            
            if (n <= 0) {
                lblSumResult.setText("Натурал тоо оруулна уу (n > 0)!");
                return;
            }
            
            long sum = (n * (n + 1)) / 2;
            
            lblSumResult.setText(String.valueOf(sum));
            
        } catch (NumberFormatException e) {
            lblSumResult.setText("Буруу утга! Бүхэл тоо оруулна уу.");
        }
    }
}
