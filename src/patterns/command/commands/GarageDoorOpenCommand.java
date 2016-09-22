package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute( ) {
        garageDoor.up();
    }

    @Override
    public void undo( ) {
        garageDoor.down();
    }
}
