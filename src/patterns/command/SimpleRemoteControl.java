package patterns.command;

import patterns.command.commands.GarageDoorOpenCommand;
import patterns.command.commands.LightOnCommand;
import patterns.command.equipment.GarageDoor;
import patterns.command.equipment.Light;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl( ) {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

    public static class Test {
        public static void main(String[] args) {
            SimpleRemoteControl remote = new SimpleRemoteControl();
            Light               light = new Light("Living Room");
            LightOnCommand lightOn = new LightOnCommand(light);

            remote.setCommand(lightOn);
            remote.buttonWasPressed();

            GarageDoor garageDoor = new GarageDoor();
            GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

            remote.setCommand(garageOpen);
            remote.buttonWasPressed();
        }
    }
}
