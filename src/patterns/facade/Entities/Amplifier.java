package patterns.facade.Entities;

public class Amplifier {
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    private int volume;

    public Amplifier( ) {
        volume = 10;
    }

    public void on() {
        System.out.println("Top-O-Line Amplifier ON");
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier OFF");
    }

    public void setCD(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Top-O-Line Amplifier setting CD player to Top-O-Line CD Player");
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setStereoSound() {
        System.out.println("Top-O-Line Amplifier stereo sound ON");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound ON");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Top-O-Line Amplifier tuner set up");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
