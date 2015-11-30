package io.hedwig.hellodesignpattern.structural.bridge;

public class JavaHelloWorldImpl implements HelloWorldImpl {
    @Override
    public String generate() {
        return "Hello Java!";
    }
}