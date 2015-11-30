package io.hedwig.hellodesignpattern.behavioral.vistor;

public interface HelloWorldElement {

    public void accept(HelloWorldVisitor visitor);
}
