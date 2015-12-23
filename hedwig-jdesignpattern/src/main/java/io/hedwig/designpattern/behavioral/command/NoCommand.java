package io.hedwig.designpattern.behavioral.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        //no command
    }

    @Override
    public void undo() {
        //no command
    }
}
