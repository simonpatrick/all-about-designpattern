package io.hedwig.designpattern.behavioral.command;

public class Stereo {
    private String description;
    private boolean on;
    private int volume;

    public Stereo(String description) {
        this.description = description;
        on = false;
        volume = 0;
    }


    public void on() {
        on = true;
        System.out.println("The " + description + " stereo is now on.");
    }

    public void off() {
        on = false;
        System.out.println("The " + description + " stereo is now off.");
    }

    public void setCD() {
        System.out.println("The " + description + " stereo is now in CD mode.");
    }

    public void setVolume(int i) {
        volume = i;
        System.out.println("The " + description + " stereo volume has been set to: " + volume);

    }

    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }

}
