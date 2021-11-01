package Lesson_9_1;

public abstract class Animal {
    iAnimal isRunning;

    protected abstract double velocity();

    protected abstract String name();


    protected boolean animalCanRun() {
        return isRunning.raceAble();
    }

}
