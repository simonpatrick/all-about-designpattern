package io.hedwig.hellodesignpattern.creational.factorymethod;

import io.hedwig.hellodesignpattern.HelloWorld;

public class FactoryMethodHelloWorldFactory extends HelloWorldFactory{

    @Override
    public HelloWorld createHelloWorld() {
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello Factory Method!";
            }
        };
    }
}
