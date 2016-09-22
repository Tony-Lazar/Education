package patterns.facade.Entities;

public class TheaterLights {
    private int brightness;

    public TheaterLights() {
        this.brightness = 30;
    }

    public void on() {

    }

    public void off() {

    }

    public void dim(int brightness) {
        this.brightness = brightness;
        System.out.println("Theater Ceiling Lights dimming to " + brightness + "%");
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
