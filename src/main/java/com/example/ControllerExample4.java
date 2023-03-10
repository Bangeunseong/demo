package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class ControllerExample4 implements Initializable {
    @FXML private AnchorPane root;
    @FXML private Circle circle; 

    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
        circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
    }
}
