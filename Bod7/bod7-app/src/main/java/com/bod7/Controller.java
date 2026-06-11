package com.bod7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtShagaiCount;

    @FXML
    private Label lblShagaiResult;

    @FXML
    void OnCalculateShagaiClick(ActionEvent event) {
        try {
            long k = Long.parseLong(txtShagaiCount.getText().trim());
            if (k < 0) {
                lblShagaiResult.setText("Шагайны тоо сөрөг байж болохгүй!");
                return;
            }
            
            long combinations = (k + 3) * (k + 2) * (k + 1) / 6;
            lblShagaiResult.setText(String.valueOf(combinations));
            
        } catch (NumberFormatException e) {
            lblShagaiResult.setText("Буруу утга! Бүхэл тоо оруулна уу.");
        }
    }
}
