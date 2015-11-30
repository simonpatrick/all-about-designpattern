package io.hedwig.hellodesignpattern.structural.facade;

import io.hedwig.hellodesignpattern.HelloWorld;
import io.hedwig.hellodesignpattern.creational.builder.HelloWorldBuilder;

public class HelloWorldFacade {

    private HelloWorldFacade(){
    }

    /**
     * facade is usually used with singleton
     */
    public static HelloWorldFacade instance(){
        return HelloWorldFacadeInstanceHolder.INSTANCE;
    }

    private static class HelloWorldFacadeInstanceHolder {
        private final static HelloWorldFacade INSTANCE = new HelloWorldFacade();
    }

    public HelloWorld facadeHelloWorld(){
        return HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("Facade").getHelloWorld();
    }

}
