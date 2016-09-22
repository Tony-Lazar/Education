package patterns.templatemethod.duck;

import java.util.Arrays;

public class Duck implements Comparable<Duck> {
    private String name;
    private int    weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString( ) {
        return name + " weight " + weight;
    }

    @Override
    public int compareTo(Duck o) {
        Duck otherDuck = (Duck) o;

        if (this.weight < otherDuck.weight)
            return -1;
        else if (this.weight == otherDuck.weight)
            return 0;
        else
            return 1;
    }

    public static class DuckSortTestDrive {
        public static void main(String[] args) {
            Duck[] ducks = {
                    new Duck("Daffy", 8),
                    new Duck("Dewey", 2),
                    new Duck("Howard", 7),
                    new Duck("Louie", 2),
                    new Duck("Donald", 10),
                    new Duck("Huey", 2)
            };

            System.out.println("Before sorting: ");
            display(ducks);

            Arrays.sort(ducks);

            System.out.println("\nAfter sorting: ");
            display(ducks);
        }

        public static void display(Duck[] ducks) {
            for (Duck duck : ducks)
                System.out.println(duck);
        }
    }
}
