package ru.job4j.calculator;

public class Calculator {
    private double result;
    public void add(double first, double second) {
        this.result = first + second;
    }
    public double getResultAdd() {
        return this.result;
    }
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    public double getResultSub() {
        return this.result;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public double getResultDiv() {
        return this.result;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    public double getResultMult() {
        return this.result;
    }
}