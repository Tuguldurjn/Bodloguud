package com.bod10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ComboBox<Integer> cmbNumberPicker;

    @FXML
    private TextArea txtAreaTableOutput;

    @FXML
    void OnGenerateTableClick(ActionEvent event) {
        txtAreaTableOutput.clear();
        Integer selectedNumber = cmbNumberPicker.getValue();
        
        if (selectedNumber == null) {
            txtAreaTableOutput.setText("Тоо сонгоно уу!");
            return;
        }
        
        StringBuilder tableBuilder = new StringBuilder();
        
        for (int i = 1; i <= 10; i++) {
            int product = selectedNumber * i;
            
            tableBuilder.append(selectedNumber)
                        .append("*")
                        .append(i)
                        .append("=")
                        .append(product)
                        .append("\n");
        }
        
        txtAreaTableOutput.setText(tableBuilder.toString());
    }
}