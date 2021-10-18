package Lesson_08;

public class Horse extends Animal {
    public Horse(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return false;
    }
}
