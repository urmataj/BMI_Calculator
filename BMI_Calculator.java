package com.example.bmi_calculator;

/**
 * Represents a BMI Calculator.
 *
 * @author Urmatai Toktosunova.
 * @since 30.10.2023
 * @version 1.0
 */
public class BMI_Calculator {
    private double weightMetric;
    private double heightMetric;
    private double weightEnglish;
    private double heightEnglish;
    private double result;

    /**
     * A non-return method that calculates your BMI based on weight and height parameters.
     */
    public void calculate() {
        if (this.weightMetric != 0 && this.heightMetric != 0) {
            this.result = this.weightMetric / (this.heightMetric * this.heightMetric * 0.0001);
        }
        else {
            this.result = this.weightEnglish / (this.heightEnglish * this.heightEnglish) * 703;
        }
    }

    /**
     * A method that check your status based on the BMI results.
     * @return A String representing the user's BMI status.
     */
    public String checkStatus() {
        if (this.result < 18.5) {
            return "Underweight";
        }
        else if (this.result >= 18.5 && this.result <= 24.9) {
            return "Normal";
        }
        else if (this.result >= 25 && this.result <= 29.9) {
            return "Overweight";
        }
        else if (this.result > 29.9) {
            return "Obese";
        }
        else {
            return "-";
        }
    }

    /**
     * Gets the weight in kg.
     * @return contains the user's weight.
     */
    public double getWeightMetric() {
        return weightMetric;
    }

    /**
     * Sets the weight.
     * @param weightMetric represents user's weight in kg.
     */
    public void setWeightMetric(double weightMetric) {
        this.weightMetric = weightMetric;
    }

    /**
     * Gets the height.
     * @return contains the user's height in cm.
     */
    public double getHeightMetric() {
        return heightMetric;
    }

    /**
     * Sets the height.
     * @param heightMetric represents the user's height in cm.
     */
    public void setHeightMetric(double heightMetric) {
        this.heightMetric = heightMetric;
    }

    /**
     * Gets the weight in lbs.
     * @return contains the user's weight.
     */
    public double getWeightEnglish() {
        return weightEnglish;
    }

    /**
     * Sets the weight.
     * @param weightEnglish represents user's weight in lbs.
     */
    public void setWeightEnglish(double weightEnglish) {
        this.weightEnglish = weightEnglish;
    }

    /**
     * Gets the height.
     * @return contains the user's height in inches.
     */
    public double getHeightEnglish() {
        return heightEnglish;
    }

    /**
     * Sets the height.
     * @param heightEnglish represents the user's height in inches.
     */
    public void setHeightEnglish(double heightEnglish) {
        this.heightEnglish = heightEnglish;
    }

    /**
     * Gets the BMI results.
     * @return contains BMI result.
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the BMI result.
     * @param result represents the BMI result.
     */
    public void setResult(double result) {
        this.result = result;
    }
}
