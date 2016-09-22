package patterns.command.commands;

import patterns.command.Command;
import patterns.command.equipment.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute( ) {
        stereo.off();
    }

    @Override
    public void undo( ) {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
