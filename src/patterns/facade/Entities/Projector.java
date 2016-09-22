package patterns.facade.Entities;

public class Projector {
    DVDPlayer dvdPlayer;

    public void on() {
        System.out.println("Top-O-Line Projector ON");
    }

    public void off() {
        System.out.println("Top-O-Line Projector OFF");
    }

    public void tvMode() {

    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode");
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
