package io.hedwig.hellodesignpattern.structural.flyweight;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldFlyWeight implements HelloWorld {

    private final String value;

    public HelloWorldFlyWeight(String value) {
        this.value = value;
    }

    @Override
    public String helloWorld() {
        return value;
    }

}
