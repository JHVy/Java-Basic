package Lesson_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static Animal getMaxSpeedAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("Animal is " + currentAnimal.getName());
            System.out.println("Speed is " + currentAnimal.getSpeed());
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.getSpeed() < currentAnimal.getSpeed()) {
                    winner = currentAnimal;
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();

        Animal dog = new Dog("Dog so 1", 20.0);
        Animal eagle = new Eagle("eagle so 1", 21.0);
        Animal falcon = new Falcon("falcon so 1", 22.0);
        Animal horse = new Horse("ngua hi hi", 20.0);
        Animal squirrel = new Squirrel("soc chipment", 10.0);
        Animal tiger = new Tiger("con cop hong", 30.0);

        animals.add(dog);
        animals.add(eagle);
        animals.add(falcon);
        animals.add(horse);
        animals.add(squirrel);
        animals.add(tiger);

        List<Animal> animalCannotFly = animals.stream().filter(animal -> !animal.isFlyable()).collect(Collectors.toList());
        Animal winner = getMaxSpeedAnimal(animalCannotFly);
        System.out.println("Winner is: " + winner.getName());
        System.out.println("Winner's speed was: " + winner.getSpeed());

    }
}
