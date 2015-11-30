package io.hedwig.hellodesignpattern.behavioral.state;

public class HelloWorldObjectState implements HelloWorldState{
    @Override
    public void append(HelloWorldStateContext helloWorldStateContext, String word) {
        helloWorldStateContext.append(word).append("!").setState(new HelloWorldFinalizedState());
    }
}
