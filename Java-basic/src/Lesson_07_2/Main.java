package Lesson_07_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final List<Animal> animalList;

    public Main(List<Animal> animalList) {
        this.animalList = animalList;
    }

   public static Animal getMaxSpeedOfAnimal(List<Animal> animals){
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("Animal is " + currentAnimal.getName());
            System.out.println("Speed is " + currentAnimal.getSpeed());
            if(winner == null){
                winner = currentAnimal;
            } else {
                if(winner.getSpeed() < currentAnimal.getSpeed()){
                    winner = currentAnimal;
                }
            }
        }
        return winner;
   }

   //Horse, Tiger, Dog, Goose, Eagle, Falcon
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        Animal dog = new Animal.AnimalBuilder().name("Dog").speed(37).isFlyable(false).build();
        Animal horse = new Animal.AnimalBuilder().name("Horse").speed(15).isFlyable(false).build();
        Animal tiger = new Animal.AnimalBuilder().name("Tiger").speed(100).isFlyable(false).build();
        Animal goose = new Animal.AnimalBuilder().name("Goose").speed(12).isFlyable(false).build();
        Animal eagle = new Animal.AnimalBuilder().name("Eagle").speed(200).isFlyable(true).build();
        Animal falcon = new Animal.AnimalBuilder().name("Falcon").speed(170).isFlyable(true).build();

        animals.add(dog);
        animals.add(horse);
        animals.add(tiger);
        animals.add(goose);
        animals.add(eagle);
        animals.add(falcon);

        List<Animal> animalCannotFly = new ArrayList<Animal>();
        for (Animal animal : animals){
            if (!animal.isFlyable){
                animalCannotFly.add(animal);
            }
        }
        Animal winner = getMaxSpeedOfAnimal(animalCannotFly);
        System.out.println("Winner is: " + winner.getName());
        System.out.println("Winner's speed was: " + winner.getSpeed());
    }

}
