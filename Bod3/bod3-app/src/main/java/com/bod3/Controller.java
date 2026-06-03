package com.bod3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

@FXML
private TextField txtCount;

@FXML
private TextArea txtAreaOutput;

@FXML
void OnPrintIOIClick(ActionEvent event) {
    txtAreaOutput.clear();
    
    try {
        int n = Integer.parseInt(txtCount.getText().trim());
        
        if (n <= 0) {
            txtAreaOutput.setText("Эерэг бүхэл тоо оруулна уу!");
            return;
        }

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append("IOI\n");
        }
        
        txtAreaOutput.setText(result.toString());

    } catch (NumberFormatException e) {
        txtAreaOutput.setText("Буруу утга! Бүхэл тоо оруулна уу.");
    }
}
}
