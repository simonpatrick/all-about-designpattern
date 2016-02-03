package io.hedwig.alg.basic.hastable;

public class DivisionHashFunction implements HashFunction {

    private final int length;

    public DivisionHashFunction(int length) {
        this.length = length;
    }

    @Override
    public int hash(int input) {
        return input % length;
    }

    @Override
    public int getLength() {
        return length;
    }
}