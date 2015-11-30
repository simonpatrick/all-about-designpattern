package io.hedwig.hellodesignpattern.creational.singleton;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldSingleton implements HelloWorld {

    @Override
    public String helloWorld() {
        return "Hello Singleton!";
    }

    public static HelloWorldSingleton instance() {
        return HelloWorldSingletonHolder.INSTANCE;
    }

    private HelloWorldSingleton() {

    }

    static class HelloWorldSingletonHolder {
        private static final HelloWorldSingleton INSTANCE = new HelloWorldSingleton();
    }

}
