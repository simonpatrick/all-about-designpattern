package io.hedwig.dp.java8.stradge;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public enum StrategyEnum {
    ADD(() -> (x, y) -> x + y), 
    MULTIPLY(() -> (x, y) -> x * y);

    private Supplier<BinaryOperator<Integer>> operation;

    private StrategyEnum(Supplier<BinaryOperator<Integer>> operation) {
        this.operation = operation;
    }

    public BinaryOperator<Integer> get() {
        return operation.get();
    }
}