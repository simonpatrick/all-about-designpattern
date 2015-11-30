package io.hedwig.hellodesignpattern.structural.decorator;

import io.hedwig.hellodesignpattern.HelloWorld;
import org.apache.commons.lang3.StringUtils;

public class HelloWorldDecorator implements HelloWorld {

    private HelloWorld helloWorld;

    public HelloWorldDecorator(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String helloWorld() {
        return helloWorld.helloWorld();
    }

    public String helloDecorator(){
        return StringUtils.substringBefore(helloWorld.helloWorld(), " ")+" Decorator!";
    }

    public static class DefaultHelloWorld implements HelloWorld {

        @Override
        public String helloWorld() {
            return "Hello World!";
        }
    }
}
