package io.hedwig.hellodesignpattern.behavioral.vistor;

import io.hedwig.hellodesignpattern.HelloWorld;

public class HelloWorldCharacterVisitor implements HelloWorldVisitor, HelloWorld {

    private StringBuffer accum;

    public HelloWorldCharacterVisitor(){
        this.accum = new StringBuffer();
    }

    @Override
    public void visit(HelloWorldElement helloWorldElement) {
        if (helloWorldElement instanceof HelloWorldCharacterElement){
            HelloWorldCharacterElement helloWorldCharacterElement = (HelloWorldCharacterElement) helloWorldElement;
            accum.append(helloWorldCharacterElement.getCh());
        }
    }

    @Override
    public String helloWorld() {
        return accum.toString();
    }
}
