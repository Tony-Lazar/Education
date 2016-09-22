package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.Stereo;

public class StereoOnWithDVDCommand implements Command {
    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute( ) {
        stereo.on();
        stereo.setDVD();
        stereo.setVolume(11);
    }

    @Override
    public void undo( ) {
        stereo.off();
    }
}
