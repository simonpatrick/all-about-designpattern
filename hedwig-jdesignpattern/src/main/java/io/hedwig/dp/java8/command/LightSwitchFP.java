package io.hedwig.dp.java8.command;

import io.hedwig.dp.java8.command.before.Light;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class LightSwitchFP {
  private List<Consumer<Light>> queue = new ArrayList<>();
  public void addCommand(Consumer<Light> cmd) {
    queue.add(cmd);
  }
  public void execute(Light light) {
    for (Consumer<Light> consumer : queue) {
        consumer.accept(light);
    }
  }
}