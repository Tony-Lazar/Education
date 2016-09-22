package javaphilosophy.innerclasses;

import javaphilosophy.innerclasses.controller.Controller;
import javaphilosophy.innerclasses.controller.Event;

public class GreenhouseControls extends Controller{
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.
                    Terminate(new Integer(args[0])));
        gc.run();
    }

    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString( ) {
            return "Light on";
        }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }

        @Override
        public void action( ) {
            light = false;
        }

        @Override
        public String toString( ) {
            return "Light off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }

        @Override
        public void action( ) {
            water = true;
        }

        @Override
        public String toString( ) {
            return "Watering on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime); }

        @Override
        public void action( ) {
            water = false;
        }

        @Override
        public String toString( ) {
            return "Watering off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action( ) {
            thermostat = "Night";
        }

        @Override
        public String toString( ) {
            return "Thermostat is using night mode";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action( ) {
            thermostat = "Day";
        }

        @Override
        public String toString( ) {
            return "Thermostat is using day mode";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }

        @Override
        public void action( ) {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString( ) {
            return "BAM!";
        }
    }
    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action( ) {
            for (Event e : eventList) {
                e.start();
                addEvent(this);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString( ) {
            return "System restart";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action( ) {
            System.exit(0);
        }

        @Override
        public String toString( ) {
            return "Disconnection";
        }
    }
}
