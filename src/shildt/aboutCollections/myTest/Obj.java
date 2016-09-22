package shildt.aboutCollections.myTest;

import java.util.Random;

public class Obj {
    int x, y;

    public Obj() {
        this.x = new Random().nextInt(10);
        this.y = new Random().nextInt(10);
    }

    public Obj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
