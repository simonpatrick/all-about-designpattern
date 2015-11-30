package io.hedwig.hellodesignpattern.behavioral.state;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldStateContext implements HelloWorld {

    private StringBuffer accum;

    private HelloWorldState state;

    public HelloWorldStateContext() {
        this.accum = new StringBuffer();
        this.state = new HelloWorldInterjectionState();
    }

    HelloWorldStateContext append(String word){
        this.accum.append(word);
        return this;
    }

    public HelloWorldStateContext setState(HelloWorldState helloWorldState) {
        this.state = helloWorldState;
        return this;
    }

    public HelloWorldStateContext appendWord(String word){
        this.state.append(this,word);
        return this;
    }

    @Override
    public String helloWorld() {
        return accum.toString();
    }

}
