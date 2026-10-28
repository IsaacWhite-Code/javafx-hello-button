package com.hellobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label messageLabel;
    // This creates a Java variable for the label in your interface. 
    // Because the variable's name matches fx:id="messageLabel" in the FXML, JavaFX connects them when it loads the screen.

    // This method contains the instructions that should run when the button is clicked. Its name matches onAction="#handleButtonClick" in your FXML.
    @FXML
    private void handleButtonClick() {
        messageLabel.setText("Hello, World!");
        // This changes the label's text from Welcome! to Hello, World!.
        // Notice that you didn't write a loop checking whether the button was clicked. JavaFX handles the click event and calls your method for you.
    }
}
