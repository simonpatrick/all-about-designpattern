package io.hedwig.dp.java8.stradge;

import java.util.function.BinaryOperator;

class ContextFP {
    private BinaryOperator<Integer> strategy;

    public ContextFP(BinaryOperator<Integer> strategy) {
        this.strategy = strategy;
    }

    public void use(Integer first, Integer second) {
        System.out.println(strategy.apply(first, second));
    }
}