package io.hedwig.jrefactoring.delegationOverInheritance;

/**
 * Created by patrick on 15/10/28.
 */
public class Sanitation {

    public String washHands(){
        return "Cleaned!";
    }
}

class Child extends Sanitation{
    public static void main(String[] args) {
        System.out.println(new Child().washHands());
    }
}

class ChildRefactor{
    Sanitation s;
    public ChildRefactor() {
        s = new Sanitation();
    }

    public String washHands(){
        return s.washHands();
    }
}
