package Lesson_9_1;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public Animal animalsRacing(List<Animal> animals) {
        List<Animal> listRacing = animalCanRun(animals);
        Animal winner = null;

        for (Animal currentAnimal : listRacing) {
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.velocity() < currentAnimal.velocity()) {
                    winner = currentAnimal;
                }
            }
        }

        return winner;
    }

    private List<Animal> animalCanRun(List<Animal> animals) {
        List<Animal> animalCanRun = new ArrayList<>();
        for (Animal currentAnimal : animals) {
            if (currentAnimal.animalCanRun()) {
                animalCanRun.add(currentAnimal);
            }
        }

        return animalCanRun;
    }

}
