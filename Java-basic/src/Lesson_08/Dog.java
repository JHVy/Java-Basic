package Lesson_08;

public class Dog extends Animal {
    public Dog(String name, Double speed) {
        super(name, speed);
    }

    @Override
    boolean isFlyable() {
        return false;
    }
}
