package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.CeilingFan;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute( ) {
        ceilingFan.medium();
    }

    @Override
    public void undo( ) {
        ceilingFan.off();
    }
}
