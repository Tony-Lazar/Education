package patterns.facade;

import patterns.facade.Entities.*;

public class HomeTheaterFacade {
    Amplifier     amp;
    Tuner         tuner;
    DVDPlayer     dvd;
    CDPlayer      cd;
    Projector     projector;
    TheaterLights lights;
    Screen        screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner,
                             DVDPlayer dvd, CDPlayer cd,
                             Projector projector, TheaterLights lights,
                             Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public static class HomeTheaterTestDrive {
        public static void main(String[] args) {
            Amplifier amp = new Amplifier();
            Tuner tuner = new Tuner();
            DVDPlayer dvd = new DVDPlayer();
            CDPlayer cd = new CDPlayer();
            Projector projector = new Projector();
            Screen screen = new Screen();
            TheaterLights lights = new TheaterLights();
            PopcornPopper popper = new PopcornPopper();

            HomeTheaterFacade homeTheater =
                    new HomeTheaterFacade(amp, tuner, dvd, cd,
                            projector, lights, screen, popper);

            homeTheater.watchMovie("Raiders of the Lost Ark");
            homeTheater.endMovie();
        }
    }
}
