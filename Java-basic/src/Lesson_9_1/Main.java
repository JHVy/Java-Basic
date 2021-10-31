package Lesson_9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Main {

    private static final int MAX_TURN = 10;
    private static final int NUMBER_OF_ANIMAL = 4;

    protected static int countTiger = 0;
    protected static int countHorse = 0;
    protected static int countElephant = 0;
    protected static int countBird = 0;
    protected static int countMax = 0;

    public static void main(String[] args) {

        for (int i = 0; i < MAX_TURN; i++) {

            System.out.println("---------------Start running----------------");

            Horse horse1 = new Horse();
            double horse1Speed = horse1.velocity();
            System.out.println("The first horse's speed: " + horse1Speed);

            Horse horse2 = new Horse();
            double horse2Speed = horse2.velocity();
            System.out.println("The second horse's speed: " + horse2Speed);

            Elephant elephant1 = new Elephant();
            double elephant1Speed = elephant1.velocity();
            System.out.println("The first elephant's speed: " + elephant1Speed);

            Elephant elephant2 = new Elephant();
            double elephant2Speed = elephant2.velocity();
            System.out.println("The second elephant's speed: " + elephant2Speed);

            Tiger tiger1 = new Tiger();
            double tiger1Speed = tiger1.velocity();
            System.out.println("The first tiger's speed: " + tiger1Speed);

            Tiger tiger2 = new Tiger();
            double tiger2Speed = tiger2.velocity();
            System.out.println("The second tiger's speed: " + tiger2Speed);

            Bird bird1 = new Bird();
            double bird1Speed = bird1.velocity();
            System.out.println("The first bird's speed: " + bird1Speed);

            Bird bird2 = new Bird();
            double bird2Speed = bird2.velocity();
            System.out.println("The second bird's speed: " + bird2Speed);


            List<Animal> animalList = new ArrayList<>();
            animalList.add(elephant1);
            animalList.add(elephant2);
            animalList.add(horse1);
            animalList.add(horse2);
            animalList.add(tiger1);
            animalList.add(tiger2);
            animalList.add(bird1);

            // Get winner for each turn
            RacingController ctr = new RacingController();
            Animal winner = ctr.animalsRacing(animalList);

            System.out.println("Winner is: " + winner.name() + " with the velocity is: " + winner.velocity());

            if (Objects.equals(winner.name(), "Tiger")) {
                System.out.println("tiger");
                countTiger++;
            } else if (Objects.equals(winner.name(), "Elephant")) {
                System.out.println("ele");
                countElephant++;
            } else if (Objects.equals(winner.name(), "Horse")) {
                System.out.println("hor");
                countHorse++;
            } else if (Objects.equals(winner.name(), "Bird")) {
                System.out.println("bir");
                countBird++;
            }
        }
        // get winner after running max turn
        int[] arr = {countHorse, countElephant, countBird, countTiger};

        Arrays.sort(arr);
        countMax = arr[NUMBER_OF_ANIMAL - 1];
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr) + "\n");
        if (countMax == countBird) {
            System.out.println("Bird is winner !");
        } else if (countMax == countElephant) {
            System.out.println("Elephant is winner !");
        } else if (countMax == countHorse) {
            System.out.println("Horse is winner !");
        } else {
            System.out.println("Tiger is winner !");
        }

    }
}
