package lesson1;

import java.util.Random;

class Human implements Actions {

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public String getName() {
        return name;
    }

    private final int jumpLimit;
    private final int runLimit;
    private final String name;


    int maxWallValue;
    int maxTrackValue;


    public Human(String name) {
        Random rnd = new Random();
        this.name = name;
        this.jumpLimit = 2 + rnd.nextInt(4);
        this.runLimit = 10 + rnd.nextInt(100);
    }


    @Override
    public boolean canJump() {
        if (maxWallValue <= jumpLimit) {
            System.out.println(getName() + " jumped over");
            return true;
        } else {
            System.out.println(getName() + " didnt make a jump");
            return false;
        }
    }

    @Override
    public boolean canRun() {
        if (maxTrackValue <= runLimit) {
            System.out.println(getName() + " ran over!");
            return true;
        } else {
            System.out.println(getName() + " didnt make a run");
            return false;
        }
    }

    public void info() {
        System.out.println("Human:" + getName() + " Can jump up to: " + getJumpLimit() + " Can run up to: " + getRunLimit());
    }
}
