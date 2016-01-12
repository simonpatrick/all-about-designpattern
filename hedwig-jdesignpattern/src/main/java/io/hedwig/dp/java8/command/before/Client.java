package io.hedwig.dp.java8.command.before;

class Client{

  public static void pressSwitch(){
    Light lamp=new Light();
    Command flipUpCommand=new FilpUpCommand(lamp);
    Command flipDowomnCmand=new FilpDownCommand(lamp);

    LightSwitch lightSwitch = new LightSwitch();
    lightSwitch.addCommand(flipUpCommand);
    lightSwitch.addCommand(flipDowomnCmand);
    lightSwitch.addCommand(flipUpCommand);
    lightSwitch.addCommand(flipDowomnCmand);

    lightSwitch.execute();
  }

  public static void main(String[] args) {
    pressSwitch();
  }
}