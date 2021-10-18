package Lesson_08;

public class Squirrel extends Animal {
    public Squirrel(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return false;
    }
}
