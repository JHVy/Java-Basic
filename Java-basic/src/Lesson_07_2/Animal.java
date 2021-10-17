package Lesson_07_2;

// Horse, Tiger, Dog, Goose, Eagle, Falcon, ...
// Run on the ground: Applicable
// Animal: flyable, speed
// Racing: Filter, speed
// Builder: design pattern

public class Animal {
    public final String name;
    public final int speed;
    public final boolean isFlyable;

    private Animal(AnimalBuilder animalBuilder) {
        this.name = animalBuilder.name;
        this.speed = animalBuilder.speed;
        this.isFlyable = animalBuilder.isFlyable;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return isFlyable;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isFlyable=" + isFlyable +
                '}';
    }

    // Inner class
    public static class AnimalBuilder{
        private String name;
        private int speed;
        private boolean isFlyable;

        public AnimalBuilder() {
        }

        public AnimalBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalBuilder isFlyable(boolean isFlyable) {
            this.isFlyable = isFlyable;
            return this;
        }

        public Animal build(){
            return new Animal(this);
       }
   }
}
