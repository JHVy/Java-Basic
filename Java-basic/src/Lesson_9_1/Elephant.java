package Lesson_9_1;

import java.security.SecureRandom;

public class Elephant extends Animal {

    private static final int MIN_STRIDE_LENGTH = 3;
    private static final int MAX_STRIDE_LENGTH = 4;

    private final double strideLength = new SecureRandom().nextInt(MAX_STRIDE_LENGTH - MIN_STRIDE_LENGTH + 1) + MIN_STRIDE_LENGTH;


    public Elephant() {
        isRunning = new AnimalCanRun();
    }

    @Override
    protected String name() {
        return "Elephant";
    }

    @Override
    protected double velocity() {
        return strideLength * 6;
    }
}
