package patterns.facade.Entities;

public class PopcornPopper {

    public void on() {
        System.out.println("Popcorn Popper ON");
    }

    public void off() {
        System.out.println("Popcorn Popper OFF");
    }

    public void pop() {
        System.out.println("Popper is popping popcorn!");
    }

    @Override
    public String toString( ) {
        return super.toString();
    }
}
