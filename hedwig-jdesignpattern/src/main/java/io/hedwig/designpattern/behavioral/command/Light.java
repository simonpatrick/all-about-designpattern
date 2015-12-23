package io.hedwig.designpattern.behavioral.command;

public class Light {
    private String description;
    private boolean on;

    public Light(String description) {
        this.description = description;
        on = false;
    }

    public void on() {
        on = true;
        System.out.println("The " + description + " light is now on.");
    }

    public void off() {
        on = false;
        System.out.println("The " + description + " light is now off.");
    }

    public boolean isOn() {
        return on;
    }
}
