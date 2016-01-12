package io.hedwig.dp.java8.command.before;

class FilpUpCommand implements Command {
  private Light light;
  public FilpUpCommand(Light light) {
    this.light = light;
  }
  public void execute() {
    light.on();
  }
}