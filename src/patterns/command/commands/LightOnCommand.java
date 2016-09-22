package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute( ) {
        light.on();
    }

    @Override
    public void undo( ) {
        light.off();
    }
}
