package io.hedwig.hellodesignpattern.creational.abstractfactory;

import io.hedwig.hellodesignpattern.SplitHelloWorld;

public interface SplitHelloWorldFactory {

    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection();

    public SplitHelloWorld.HelloWorldObject createHelloWorldObject();
}
