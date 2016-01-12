package io.hedwig.dp.java8.command.before;

import java.util.ArrayList;
import java.util.List;

class LightSwitch{
  private List<Command> queue=new ArrayList<>();

  public void addCommand(Command cmd){
    queue.add(cmd);
  }

  public void execute(){
    for(Command cmd:queue){
        cmd.execute();
    }
  }
}