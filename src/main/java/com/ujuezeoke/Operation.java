package com.ujuezeoke;

import java.util.function.BinaryOperator;

public enum Operation {
    ADD(Double::sum),
    MINUS((a, b) -> a - b);

    private BinaryOperator<Double> function;

    Operation(BinaryOperator<Double> function) {
        this.function = function;
    }

    public double apply(double first, double right){
        return this.function.apply(first, right);
    }
}
