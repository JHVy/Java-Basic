package Lesson_08;

public class Tiger extends Animal {
    public Tiger(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return false;
    }
}
