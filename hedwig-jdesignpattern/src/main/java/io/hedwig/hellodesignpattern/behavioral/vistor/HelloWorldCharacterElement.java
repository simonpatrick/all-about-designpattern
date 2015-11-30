package io.hedwig.hellodesignpattern.behavioral.vistor;

public class HelloWorldCharacterElement implements HelloWorldElement{

    private char ch;

    public HelloWorldCharacterElement(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public void accept(HelloWorldVisitor visitor) {
        visitor.visit(this);
    }
}
