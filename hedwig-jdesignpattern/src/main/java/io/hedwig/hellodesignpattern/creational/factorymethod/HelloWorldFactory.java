package io.hedwig.hellodesignpattern.creational.factorymethod;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldFactory {

    public HelloWorld createHelloWorld(){
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello World!";
            }
        };
    }
}
