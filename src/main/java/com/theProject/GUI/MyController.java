package com.theProject.GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MyController {

    @FXML
    private Button myButton;

   
    @FXML
    private void handleButtonClick() {
       
        System.out.println("Button was clicked!");
        myButton.setText("Clicked!"); 
    }
}
