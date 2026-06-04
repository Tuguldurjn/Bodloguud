package com.bod5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtTriangleSides;

    @FXML
    private Label lblTriangleResult;

    @FXML
    void OnCalculateTriangleAreaClick(ActionEvent event) {
        try {
            String input = txtTriangleSides.getText().trim();
            String[] parts = input.split("\\s+");
            
            if (parts.length != 3) {
                lblTriangleResult.setText("3 талын уртыг зайгаар тусгаарлаж оруулна уу!");
                return;
            }
            
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            double c = Double.parseDouble(parts[2]);
            
            if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
                lblTriangleResult.setText("Ийм гурвалжин оршин тогтнохгүй!");
                return;
            }
            
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            lblTriangleResult.setText(String.format("%.2f", area));
            
        } catch (NumberFormatException e) {
            lblTriangleResult.setText("Буруу утга! Бодит тоо оруулна уу.");
        }
    }
}
