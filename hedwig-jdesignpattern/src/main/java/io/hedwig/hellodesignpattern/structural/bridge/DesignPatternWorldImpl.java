package io.hedwig.hellodesignpattern.structural.bridge;

public class DesignPatternWorldImpl implements HelloWorldImpl {
    @Override
    public String generate() {
        return "Hello Bridge!";
    }
}