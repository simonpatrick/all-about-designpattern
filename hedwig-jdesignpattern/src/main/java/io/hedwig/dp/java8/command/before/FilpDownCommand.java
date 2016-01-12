package io.hedwig.dp.java8.command.before;

class FilpDownCommand implements Command {
  private Light light;
  public FilpDownCommand(Light light) {
    this.light = light;
  }
  public void execute() {
    light.off();
  }
}