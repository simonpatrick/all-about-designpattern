package io.hedwig.jrefactoring.pullUpMethod;

/**
 * Created by patrick on 15/10/28.
 */
public abstract class Vehicle {

    public class Car extends Vehicle {
        public void turn(Direction d) {
            System.out.println("turing to " + d);
        }
    }

    public class Motorcycle extends Vehicle {
        public void turn(Direction d) {
            System.out.println("turing to " + d);
        }
    }

    public enum Direction {
        Left, Right
    }
}
