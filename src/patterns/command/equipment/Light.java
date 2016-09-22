package patterns.command.equipment;

public class Light {

    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Light is on in " + room);
    }

    public void off() {
        System.out.println("Light is off in " + room);
    }
}
