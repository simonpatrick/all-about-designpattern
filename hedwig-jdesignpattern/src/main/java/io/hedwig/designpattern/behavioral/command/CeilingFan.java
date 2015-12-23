package io.hedwig.designpattern.behavioral.command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String description;
    int speed;

    public CeilingFan(String description) {
        this.description = description;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("The " + description + " fan is set to high.");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("The " + description + " fan is set to medium.");
    }

    public void low() {
        speed = LOW;
        System.out.println("The " + description + " fan is set to low.");
    }

    public void off() {
        speed = OFF;
        System.out.println("The " + description + " fan is set to off.");
    }

    public int getSpeed() {
        return speed;
    }

}
