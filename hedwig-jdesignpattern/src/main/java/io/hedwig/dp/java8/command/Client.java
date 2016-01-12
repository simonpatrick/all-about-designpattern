package io.hedwig.dp.java8.command;

import io.hedwig.dp.java8.command.before.Light;

import java.util.function.Consumer;

class Client {
  public static void pressSwitch() {
    Light lamp = new Light();

    Consumer<Light> flipUp = light -> {light.on();};
    Consumer<Light> flipDown = light -> {light.off();};
    LightSwitchFP lightSwitch = new LightSwitchFP();
    lightSwitch.addCommand(flipUp);
    lightSwitch.addCommand(flipDown);
    lightSwitch.addCommand(flipUp);
    lightSwitch.addCommand(flipDown);

    lightSwitch.execute(lamp);
  }
}
