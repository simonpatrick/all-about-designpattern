package io.hedwig.hellodesignpattern.creational.abstractfactory;

import io.hedwig.hellodesignpattern.SplitHelloWorld;

public class JavaSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection() {
        return new SplitHelloWorld.DefaultInterjection();
    }

    @Override
    public SplitHelloWorld.HelloWorldObject createHelloWorldObject() {
        return new JavaHelloWorldObject();
    }

    class JavaHelloWorldObject implements SplitHelloWorld.HelloWorldObject {

        @Override
        public String object() {
            return "Java";
        }
    }
}
