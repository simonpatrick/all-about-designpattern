package io.hedwig.dp.java8.stradge.before;

class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void use(Integer first, Integer second) {
        System.out.println(this.strategy.compute(first, second));
    }
}