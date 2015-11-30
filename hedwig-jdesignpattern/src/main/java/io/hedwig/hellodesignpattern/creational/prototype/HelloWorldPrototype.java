package io.hedwig.hellodesignpattern.creational.prototype;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldPrototype implements HelloWorld {

    private String helloWorld;

    public HelloWorldPrototype(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld clone() {
        return new HelloWorldPrototype(this.helloWorld);
    }

    @Override
    public String helloWorld() {
        return helloWorld;
    }

    public final static HelloWorldPrototype PROTOTYPE = new HelloWorldPrototype("Hello Prototype!");
}
