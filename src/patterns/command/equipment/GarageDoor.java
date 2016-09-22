package patterns.command.equipment;

public class GarageDoor {

    public void up() {
        System.out.println("Garage is opened");
    }

    public void down() {
        System.out.println("Garage is closed");
    }

    public void stop() {
        System.out.println("Garage door stopped");
    }

    public void lightOn() {
        System.out.println("Garage door light is on");
    }

    public void lightOff() {
        System.out.println("Garage door light is off");
    }
}
