package Lesson_9_1;

public abstract class Animal {
    protected int winCount = 0;
    iAnimal isRunning;

    protected abstract double velocity();

    protected abstract String name();

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    protected boolean animalCanRun() {
        return isRunning.raceAble();
    }

}
