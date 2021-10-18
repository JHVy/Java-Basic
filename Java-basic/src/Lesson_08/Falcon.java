package Lesson_08;

public class Falcon extends Animal {
    public Falcon(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return true;
    }
}
