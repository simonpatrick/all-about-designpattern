package io.hedwig.hellodesignpattern.structural.proxy;

import io.hedwig.hellodesignpattern.HelloWorld;
import org.apache.commons.lang3.StringUtils;

public class HelloWorldProxy implements HelloWorld {

    private HelloWorld helloWorld;

    public HelloWorldProxy(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String helloWorld() {
        return StringUtils.substringBefore(helloWorld.helloWorld(), " ")+" Proxy!";
    }

    public static class DefaultHelloWorld implements HelloWorld {

        @Override
        public String helloWorld() {
            return "Hello World!";
        }
    }
}
