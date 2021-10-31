package Lesson_9_1;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private static final int MIN_WEIGHT = 250;
    private static final int MAX_WEIGHT = 400;

    private final double weight = new SecureRandom().nextInt(MAX_WEIGHT - MIN_WEIGHT + 1) + MIN_WEIGHT;

    public Tiger() {
        isRunning = new AnimalCanRun();
    }

    @Override
    protected double velocity() {
        return 0.06 * weight;
    }

    @Override
    protected String name() {
        return "Tiger";
    }
}
