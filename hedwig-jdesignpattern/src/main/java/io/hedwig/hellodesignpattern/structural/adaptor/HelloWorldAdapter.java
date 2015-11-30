package io.hedwig.hellodesignpattern.structural.adaptor;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldAdapter implements HelloWorld {

    private HelloAdapterDesignPattern helloDesignPattern;

    public HelloWorldAdapter(HelloAdapterDesignPattern helloDesignPattern) {
        this.helloDesignPattern = helloDesignPattern;
    }

    @Override
    public String helloWorld() {
        return helloDesignPattern.helloDesignPattern();
    }
}
