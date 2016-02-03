package io.hedwig.alg.basic.hastable;

public interface HashFunction {

    int hash(int input);

    int getLength();

}