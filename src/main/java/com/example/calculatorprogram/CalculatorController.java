package com.example.calculatorprogram;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.application.Platform;

public class CalculatorController {

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private Label middleLabel;

    private CalculatorService calculatorService;

    public CalculatorController() {
        calculatorService = new CalculatorService();
    }

    @FXML
    protected void addStuff() {
        float a = Float.parseFloat(textField1.getText());
        float b = Float.parseFloat(textField2.getText());
        float answer = calculatorService.add(a, b);
        textField3.setText(Float.toString(answer));
        middleLabel.setText("Adding your numbers!");
    }

    @FXML
    protected void subtractStuff() {
        float a = Float.parseFloat(textField1.getText());
        float b = Float.parseFloat(textField2.getText());
        float answer = calculatorService.subtract(a, b);
        textField3.setText(Float.toString(answer));
        middleLabel.setText("Subtracting your numbers!");
    }

    @FXML
    protected void divideStuff() {
        float a = Float.parseFloat(textField1.getText());
        float b = Float.parseFloat(textField2.getText());
        float answer = calculatorService.divide(a, b);
        textField3.setText(Float.toString(answer));
        middleLabel.setText("Dividing your numbers!");
    }

    @FXML
    protected void multiplyStuff() {
        float a = Float.parseFloat(textField1.getText());
        float b = Float.parseFloat(textField2.getText());
        float answer = calculatorService.multiply(a, b);
        textField3.setText(Float.toString(answer));
        middleLabel.setText("Multiplying your numbers!");
    }

    @FXML
    protected void clearStuff() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        middleLabel.setText("Clearing your numbers!");
    }

    @FXML
    protected void exitStuff() {
        Platform.exit();
    }
}