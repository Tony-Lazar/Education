package patterns.command.equipment;

public class CeilingFan {

    private String room;
    private int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan high in " + room);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan medium in " + room);
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan low in " + room);
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling Fan off in " + room);
    }

    public int getSpeed() {
        return speed;
    }
}
