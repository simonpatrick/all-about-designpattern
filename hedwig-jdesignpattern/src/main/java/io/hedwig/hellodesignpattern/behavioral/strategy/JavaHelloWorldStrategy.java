package io.hedwig.hellodesignpattern.behavioral.strategy;

public class JavaHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Java!";
    }
}