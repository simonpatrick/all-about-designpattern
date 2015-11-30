package io.hedwig.hellodesignpattern.structural.bridge;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldBridge implements HelloWorld {

    private HelloWorldImpl helloWorldImpl;

    public HelloWorldBridge(HelloWorldImpl helloWorldImpl) {
        this.helloWorldImpl = helloWorldImpl;
    }

    @Override
    public String helloWorld() {
        return helloWorldImpl.generate();
    }
}
