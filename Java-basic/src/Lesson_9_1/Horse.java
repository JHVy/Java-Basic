package Lesson_9_1;

import java.security.SecureRandom;

public class Horse extends Animal {

    private static final int MIN_VELOCITY = 15;
    private static final int MAX_VELOCITY = 24;

    private final double velocity = new SecureRandom().nextInt(MAX_VELOCITY - MIN_VELOCITY + 1) + MIN_VELOCITY;

    public Horse() {
        isRunning = new AnimalCanRun();
    }

    @Override
    protected double velocity() {
        return velocity;
    }

    @Override
    protected String name() {
        return "Horse";
    }
}
