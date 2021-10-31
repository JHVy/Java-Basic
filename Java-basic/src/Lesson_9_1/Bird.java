package Lesson_9_1;

import java.security.SecureRandom;

public class Bird extends Animal {

    private static final int MIN_VELOCITY = 500;
    private static final int MAX_VELOCITY = 600;

    private final double velocity = new SecureRandom().nextInt(MAX_VELOCITY - MIN_VELOCITY + 1) + MIN_VELOCITY;

    public Bird() {
        isRunning = new AnimalCannotRun();
    }

    @Override
    protected double velocity() {
        return velocity;
    }

    @Override
    protected String name() {
        return "Bird";
    }
}
