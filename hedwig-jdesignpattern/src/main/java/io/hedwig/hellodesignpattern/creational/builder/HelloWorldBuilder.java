package io.hedwig.hellodesignpattern.creational.builder;

import io.hedwig.hellodesignpattern.HelloWorld;
import io.hedwig.hellodesignpattern.SplitHelloWorld;

public class HelloWorldBuilder {

    private String interjection;

    private String object;

    public static HelloWorldBuilder builder() {
        return new HelloWorldBuilder();
    }

    public HelloWorldBuilder interjection(String interjection) {
        this.interjection = interjection;
        return this;
    }

    public HelloWorldBuilder object(String object) {
        this.object = object;
        return this;
    }

    public HelloWorld getHelloWorld() {
        return new SplitHelloWorld(new SplitHelloWorld.HelloWorldInterjection() {
            @Override
            public String interjection() {
                return interjection;
            }
        }, new SplitHelloWorld.HelloWorldObject() {
            @Override
            public String object() {
                return object;
            }
        });
    }

}
