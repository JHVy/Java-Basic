package Lesson_08;

// Tiger, Horse, Dog, Eagle, Falcon, Squirrel, ...
// Double speed(), boolean flyable()
//abstract
// controller: filter !flyable -> running

abstract class Animal {
    private String name;
    private Double speed;
    private Boolean isFlyable;

    public Animal(String name, Double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public Double getSpeed() {
        return speed;
    }

    abstract boolean isFlyable();
}
