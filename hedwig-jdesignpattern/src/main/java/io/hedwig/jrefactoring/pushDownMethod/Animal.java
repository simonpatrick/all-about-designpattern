package io.hedwig.jrefactoring.pushDownMethod;

/**
 * Created by patrick on 15/10/28.
 */
public abstract class Animal {
    public void bark(){
        System.out.println("testing");
    }
}

class Dog extends Animal{

}

class Cat extends Animal{

}
