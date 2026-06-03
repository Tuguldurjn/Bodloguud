package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtNumber;

    @FXML
    private Label lblCheckResult;

    @FXML
    void OnCheckNumberClick(ActionEvent event) {
        try {
            String input = txtNumber.getText().trim();
            
            int num = Integer.parseInt(input);

            if (num < 5) {
                lblCheckResult.setText("YES");
            } else {
                lblCheckResult.setText("NO");
            }

        } catch (NumberFormatException e) {
            lblCheckResult.setText("Тоогоо оруулна уу!");
        }
    }
}