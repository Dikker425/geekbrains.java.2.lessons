package lesson1;

import java.util.Random;

public class Wall {

    private static final Random rnd = new Random();
    private final int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }

}
