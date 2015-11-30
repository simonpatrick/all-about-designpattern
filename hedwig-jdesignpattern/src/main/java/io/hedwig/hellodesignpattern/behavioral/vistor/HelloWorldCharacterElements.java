package io.hedwig.hellodesignpattern.behavioral.vistor;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldCharacterElements implements HelloWorldElement {

    private List<HelloWorldCharacterElement> helloWorldCharacterElements;

    public HelloWorldCharacterElements(char... chars){
        this.helloWorldCharacterElements = new ArrayList<HelloWorldCharacterElement>();
        for (char ch : chars) {
             helloWorldCharacterElements.add(new HelloWorldCharacterElement(ch));
        }
    }

    @Override
    public void accept(HelloWorldVisitor visitor) {
        for (HelloWorldCharacterElement helloWorldCharacterElement : helloWorldCharacterElements) {
            visitor.visit(helloWorldCharacterElement);
        }
    }
}
