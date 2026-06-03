package com.bod1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtLength;

    @FXML
    private TextField txtWidth;

    @FXML
    private Label lblResult;

    @FXML
    void OnButtonClick(ActionEvent event) {
        try {
            String lengthStr = txtLength.getText().trim();
            String widthStr = txtWidth.getText().trim();

            int length = Integer.parseInt(lengthStr);
            int width = Integer.parseInt(widthStr);
            int area = length * width;
            int perimeter = 2 * (length + width);
            String output = area + " " + perimeter;
            lblResult.setText(output);

        } catch (NumberFormatException e) {
            lblResult.setText("зөв оруулна уу!");
        }
    }
}