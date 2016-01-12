package io.hedwig.dp.java8.stradge;

class Context1FP {
    private StrategyEnum strategy;

    public Context1FP(StrategyEnum strategy) {
        this.strategy = strategy;
    }

    public void use(Integer first, Integer second) {
        System.out.println(strategy.get().apply(first, second));
    }
}