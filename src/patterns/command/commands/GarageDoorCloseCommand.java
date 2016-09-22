package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute( ) {
        garageDoor.down();
    }

    @Override
    public void undo( ) {
        garageDoor.up();
    }
}
