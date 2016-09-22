package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.CeilingFan;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute( ) {
        ceilingFan.off();
    }

    @Override
    public void undo( ) {
        ceilingFan.medium();
    }
}
