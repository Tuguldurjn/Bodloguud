package com.bod9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Arrays;

public class Controller {

    @FXML
    private TextField txtSidesInput;

    @FXML
    private ComboBox<String> cmbDisplayMode;

    @FXML
    private Label lblCheckResult;

    @FXML
    void OnCheckTriangleClick(ActionEvent event) {
        try {
            String input = txtSidesInput.getText().trim();
            String[] parts = input.split("\\s+");
            
            if (parts.length != 3) {
                lblCheckResult.setText("3 талын уртыг зайгаар тусгаарлаж оруулна уу!");
                return;
            }
            
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            
            if (a <= 0 || b <= 0 || c <= 0) {
                lblCheckResult.setText("Талуудын урт 0-ээс их байх ёстой!");
                return;
            }
            
            boolean isTriangle = (a + b > c) && (a + c > b) && (b + c > a);
            
            String chosenMode = cmbDisplayMode.getValue();
            
            if (!isTriangle) {
                lblCheckResult.setText("Стандарт текст".equals(chosenMode) ? "NO" : "NO: Ийм талуудаар гурвалжин байгуулах боломжгүй!");
                return;
            }
            
            if ("Стандарт текст".equals(chosenMode)) {
                lblCheckResult.setText("YES");
            } else if ("Дэлгэрэнгүй тайлбар".equals(chosenMode)) {
                
                String sideType = "";
                if (a == b && b == c) {
                    sideType = "Зөв";
                } else if (a == b || b == c || a == c) {
                    sideType = "Адил хажуут";
                } else {
                    sideType = "Ердийн";
                }
                
                int[] sortedSides = {a, b, c};
                Arrays.sort(sortedSides);
                
                long side1_sq = (long) sortedSides[0] * sortedSides[0];
                long side2_sq = (long) sortedSides[1] * sortedSides[1];
                long longest_sq = (long) sortedSides[2] * sortedSides[2];
                
                String angleType = "";
                if (side1_sq + side2_sq == longest_sq) {
                    angleType = "Тэгш өнцөгт";
                } else if (side1_sq + side2_sq < longest_sq) {
                    angleType = "Мохоо өнцөгт";
                } else {
                    angleType = "Хурц өнцөгт";
                }
                
                lblCheckResult.setText(String.format(
                    "YES: Гурвалжин байгуулах боломжтой.\n\n" +
                    "• Талын хэлбэр: %s\n" +
                    "• Өнцгийн хэлбэр: %s", 
                    sideType, angleType
                ));
            }
            
        } catch (NumberFormatException e) {
            lblCheckResult.setText("Буруу утга! Бүхэл тоо оруулна уу.");
        }
    }
}