package io.hedwig.hellodesignpattern.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<Observer>();
    }

    public Subject attach(Observer observer){
        observers.add(observer);
        return this;
    }

    public void notifyObservers(){
        observers.forEach(io.hedwig.hellodesignpattern.behavioral.
                observer.Observer::update);
    }

}
