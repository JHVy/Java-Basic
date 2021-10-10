package Lesson_06_JHVy;

//Horse: maxSpeech = 75 km/h
// Tiget: maxSpeech = 100 km/h
//Dog: maxSpeech = 60 km/h

public class main {
    public static class Main {
        public static void main(String[] args) {

            Horse horse = new Horse();
            int horseSpeed = horse.setSpeed();
            System.out.println("Horse's speed: " + horseSpeed);

            Dog dog = new Dog();
            int dogSpeed = dog.setSpeed();
            System.out.println("Dog's speed: " + dogSpeed);

            Tiger tiger = new Tiger();
            int tigerSpeed = tiger.setSpeed();
            System.out.println("Tiger's speed: " + tigerSpeed);

            if (horseSpeed == tigerSpeed && horseSpeed == dogSpeed) {
                System.out.println("3 animals run at the same rate !");
            } else if (horseSpeed >= tigerSpeed && horseSpeed >= dogSpeed) {
                System.out.println("Winner is " + Horse.getDefaultName() + ", with speed " + horseSpeed);
            } else if (dogSpeed >= tigerSpeed && dogSpeed >= horseSpeed) {
                System.out.println("Winner is " + Dog.getDefaultName() + ", with speed " + dogSpeed);
            } else {
                System.out.println("Winner is " + Tiger.getDefaultName() + ", with speed " + tigerSpeed);
            }
        }
    }
}

