package lesson1;

import java.util.Random;

class Robot implements Actions {

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

    public Robot(String name) {
        Random rnd = new Random();
        this.name = name;
        this.jumpLimit = 1 + rnd.nextInt(5);
        this.runLimit = 100 + rnd.nextInt(500);
    }


    @Override
    public boolean canJump() {
        if (jumpLimit >= maxWallValue) {
            System.out.println(getName() + " jumped over");
            return true;
        } else {
            System.out.println(getName() + " didnt make a jump");
            return false;
        }
    }

    @Override
    public boolean canRun() {
        if (this.runLimit >= maxTrackValue) {
            System.out.println(getName() + " ran over!");
            return true;
        } else {
            System.out.println(getName() + " didnt make a run");
            return false;
        }
    }

    @Override
    public void info() {
        System.out.println("Robot:" + getName() + " Can jump up to: " + getJumpLimit() + " Can run up to: " + getRunLimit());
    }
}
