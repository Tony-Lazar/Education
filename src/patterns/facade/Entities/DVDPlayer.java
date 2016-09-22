package patterns.facade.Entities;

public class DVDPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("Top-O-Line DVD Player ON");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player OFF");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void pause() {
        System.out.println("Top-O-Line DVD Player paused");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing \"" + movie + "\"");
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {

    }
}
