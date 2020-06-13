package lesson1;

import java.util.Random;

class Cat implements Actions {

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


    public Cat(String name) {
        Random rnd = new Random();
        this.name = name;
        this.jumpLimit = 5 + rnd.nextInt(10);
        this.runLimit = 50 + rnd.nextInt(200);
    }


    @Override
    public boolean canJump() {
        if (this.jumpLimit >= maxWallValue) {
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
        System.out.println("Cat:" + getName() + " Can jump up to: " + getJumpLimit() + " Can run up to: " + getRunLimit());
    }
}
