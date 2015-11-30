package io.hedwig.hellodesignpattern.behavioral.observer;

import java.io.PrintStream;

public class HelloWorldObserver implements Observer {

    private PrintStream printer = System.out;

    public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }

    @Override
    public void update() {
        printer.println("Hello Observer!");
    }
}
