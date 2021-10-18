package Lesson_08;

public class Eagle extends Animal {
    public Eagle(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return true;
    }
}
