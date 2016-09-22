package patterns.command;

import patterns.command.commands.*;
import patterns.command.equipment.CeilingFan;
import patterns.command.equipment.GarageDoor;
import patterns.command.equipment.Light;
import patterns.command.equipment.Stereo;

import java.util.Arrays;

public class RemoteControl {
    Command[] offCommands;
    Command[] onCommands;
    Command   undoCommand;

    public RemoteControl( ) {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed( ) {
        undoCommand.undo();
    }

    @Override
    public String toString( ) {
        StringBuffer sb = new StringBuffer();
        sb.append("\n---------- Remote Control ----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                    "           " + offCommands[i].getClass().getName() + "\n");
        }
        sb.append("[undo]   " + undoCommand.getClass().getName() + "\n");
        return sb.toString();
    }

    public static class RemoteLoader {
        public static void main(String[] args) {
            RemoteControl remoteControl = new RemoteControl();

            Light      livingRoomLight = new Light("Living Room");
            Light      kitchenLight    = new Light("Kitchen");
            CeilingFan ceilingFan      = new CeilingFan("Living Room");
            GarageDoor garageDoor      = new GarageDoor();
            Stereo     stereo          = new Stereo("Living Room");

            LightOnCommand livingRoomLightOn =
                    new LightOnCommand(livingRoomLight);
            LightOffCommand livingRoomLightOff =
                    new LightOffCommand(livingRoomLight);
            LightOnCommand kitchenLightOn =
                    new LightOnCommand(kitchenLight);
            LightOffCommand kitchenLightOff =
                    new LightOffCommand(kitchenLight);

            CeilingFanOnCommand ceilingFanOn =
                    new CeilingFanOnCommand(ceilingFan);
            CeilingFanOffCommand ceilingFanOff =
                    new CeilingFanOffCommand(ceilingFan);

            GarageDoorOpenCommand garageDoorOpen =
                    new GarageDoorOpenCommand(garageDoor);
            GarageDoorCloseCommand garageDoorClose =
                    new GarageDoorCloseCommand(garageDoor);

            StereoOnWithCDCommand stereoOnWithCD =
                    new StereoOnWithCDCommand(stereo);
            StereoOffCommand stereoOff =
                    new StereoOffCommand(stereo);
            remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
            remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
            remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
            remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

            System.out.println(remoteControl);

            remoteControl.onButtonPushed(0);
            remoteControl.offButtonPushed(0);
            System.out.println("before undo");
            remoteControl.undoButtonPushed();
            remoteControl.onButtonPushed(1);
            remoteControl.offButtonPushed(1);
            remoteControl.onButtonPushed(2);
            remoteControl.offButtonPushed(2);
            remoteControl.onButtonPushed(3);
            System.out.println("before undo");
            remoteControl.undoButtonPushed();
            remoteControl.offButtonPushed(3);
        }
    }

    public static class RemoteLoaderWithUndo {
        public static void main(String[] args) {
            RemoteControl remoteControl = new RemoteControl();

            CeilingFan ceilingFan = new CeilingFan("Living Room");

            CeilingFanMediumCommand ceilingFanMedium =
                    new CeilingFanMediumCommand(ceilingFan);
            CeilingFanHighCommand ceilingFanHigh =
                    new CeilingFanHighCommand(ceilingFan);
            CeilingFanOffCommand ceilingFanOff =
                    new CeilingFanOffCommand(ceilingFan);

            remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
            remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

            remoteControl.onButtonPushed(0);
            remoteControl.offButtonPushed(0);
            System.out.println(remoteControl);
            remoteControl.undoButtonPushed();

            remoteControl.onButtonPushed(1);
            System.out.println(remoteControl);
            remoteControl.undoButtonPushed();
        }
    }
}
