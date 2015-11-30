package io.hedwig.hellodesignpattern.behavioral.strategy;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldStrategyContext implements HelloWorld {

    private HelloWorldStrategy helloWorldStrategy;

    public HelloWorldStrategyContext(HelloWorldStrategy helloWorldStrategy) {
        this.helloWorldStrategy = helloWorldStrategy;
    }

    @Override
    public String helloWorld() {
        return helloWorldStrategy.helloWorld();
    }
}
