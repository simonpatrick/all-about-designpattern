package io.hedwig.hellodesignpattern.behavioral.state;

public interface HelloWorldState {

    public void append(HelloWorldStateContext helloWorldStateContext, String word);
}