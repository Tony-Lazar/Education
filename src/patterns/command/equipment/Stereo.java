package patterns.command.equipment;

public class Stereo {

    private String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Stereo is on in " + room);
    }

    public void off() {
        System.out.println("Stereo is off in " + room);
    }

    public void setCD() {
        System.out.println("Stereo set CD in " + room);
    }

    public void setDVD() {
        System.out.println("Stereo set DVD in " + room);
    }

    public void setRadio() {
        System.out.println("Stereo set Radio in " + room);
    }

    public void setVolume(int volume) {
        System.out.println("Stereo set Volume on: " + volume + " in " + room);
    }
}
