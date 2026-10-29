
package com.hellobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label messageLabel;

    @FXML
    private TextField nameField;

    @FXML
    private void handleButtonClick() {
        String name = nameField.getText().trim();

        if (name.isEmpty()) {
            messageLabel.setText("Please enter your name!");
        } else {
            messageLabel.setText("Hello, " + name + "!");
        }
    }
}
