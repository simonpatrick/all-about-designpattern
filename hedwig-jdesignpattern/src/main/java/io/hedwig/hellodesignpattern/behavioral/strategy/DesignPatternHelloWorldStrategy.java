package io.hedwig.hellodesignpattern.behavioral.strategy;

public class DesignPatternHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Strategy!";
    }
}
