package com.ujuezeoke;


public class Calculator {
    private double currentNumber;
    private Operation lastOperation;
    private Calculator(){ }

    public static Calculator start() {
        return new Calculator();
    }

    public Calculator number(int i) {
        if(lastOperation == null){
            currentNumber = i;
        }else{
            currentNumber = process(i);
        }
        return this;
    }

    private double process(int i) {
        double numberToReturn = lastOperation.apply(currentNumber, i);
        lastOperation = null;
        return numberToReturn;
    }

    public double result() {
        return currentNumber;
    }

    public Calculator operation(Operation operation) {
        lastOperation = operation;
        return this;
    }
}
