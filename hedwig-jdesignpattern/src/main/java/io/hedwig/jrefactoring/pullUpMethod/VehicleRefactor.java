package io.hedwig.jrefactoring.pullUpMethod;

/**
 * Created by patrick on 15/10/28.
 */
public abstract class VehicleRefactor {

    public void turn(Direction d) {
        System.out.println("turing to " + d);
    }

    public class Car extends VehicleRefactor {
    }

    public class Motorcycle extends VehicleRefactor {
    }

    public enum Direction {
        Left, Right
    }
}
