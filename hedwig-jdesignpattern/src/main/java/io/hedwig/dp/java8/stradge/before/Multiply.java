package io.hedwig.dp.java8.stradge.before;

class Multiply implements Strategy {
    public Integer compute(Integer op1, Integer op2) {
        return op1 * op2;
    }
}