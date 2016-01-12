package io.hedwig.dp.java8.stradge;

import java.util.function.BinaryOperator;

/**
 * Created by patrick on 16/1/6.
 */
public class StraFP {
    public static final BinaryOperator<Integer> add = (op1, op2) -> op1 + op2;
    public static final BinaryOperator<Integer> multiply = (op1, op2) -> op1 * op2;

    public static void main(String[] args) {
        StraFP fp = new StraFP();
        ContextFP ctx = new ContextFP(StraFP.add);
        ctx.use(1, 2);
    }
}


