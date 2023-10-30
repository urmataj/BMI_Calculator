package com.example.bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    BMI_Calculator calc = new BMI_Calculator();

    @FXML
    private Label appName;

    @FXML
    private Label metricUnits;

    @FXML
    private  Label englishUnits;

    @FXML
    private Label weightMetric;

    @FXML
    private TextField inputWeightMetric;

    @FXML
    private TextField inputWeightEnglish;

    @FXML
    private Label heightMetric;

    @FXML
    private TextField inputHeightMetric;

    @FXML
    private TextField inputHeightEnglish;

    @FXML
    private Label result;

    @FXML
    private Label status;

    @FXML
    protected void onCalculateButtonClick() {
        if (inputWeightEnglish.getText().isEmpty() && inputHeightEnglish.getText().isEmpty()) {
            String val1 = inputWeightMetric.getText();
            double weight = Double.parseDouble(val1);

            String val2 = inputHeightMetric.getText();
            double height = Double.parseDouble(val2);
            calc.setWeightMetric(weight);
            calc.setHeightMetric(height);
        }
        else if (inputWeightMetric.getText().isEmpty() && inputHeightMetric.getText().isEmpty()) {
            String val3 = inputWeightEnglish.getText();
            double weight2 = Double.parseDouble(val3);

            String val4 = inputHeightEnglish.getText();
            double height2 = Double.parseDouble(val4);

            calc.setWeightEnglish(weight2);
            calc.setHeightEnglish(height2);
        }
        else {
            System.out.println("Error");
        }

        calc.calculate();

        double res = calc.getResult();
        this.result.setText(Double.toString(res));

        this.status.setText(calc.checkStatus());
    }

    @FXML
    protected void onClearButtonClick() {
        inputWeightMetric.setText("");
        inputHeightMetric.setText("");
        inputWeightEnglish.setText("");
        inputHeightEnglish.setText("");
        this.result.setText("");
        this.status.setText("");
    }

    @FXML
    protected void onExitButtonClick() {
        javafx.application.Platform.exit();
    }
}
