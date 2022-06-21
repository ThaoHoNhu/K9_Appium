package lab_08;
import lab_07_2.AnimalRacing;

import java.util.*;
import java.security.SecureRandom;
import static lab_08.Animal.Builder;

public class AnimalController {

    public static void main(String[] args) {

        Builder tigerBuilder = new Builder();
        tigerBuilder.setName("Tiger");
        tigerBuilder.setFlyable(false);
        tigerBuilder.setSpeed(new SecureRandom().nextInt(100));
        Animal tiger = tigerBuilder.build();
        System.out.println(tiger.getSpeed());

        Builder horseBuilder = new Animal.Builder();
        horseBuilder.setName("Horse");
        horseBuilder.setFlyable(false);
        horseBuilder.setSpeed(new SecureRandom().nextInt(75));
        Animal horse = horseBuilder.build();
        System.out.println(horse.getSpeed());

        Builder dogBuilder = new Builder();
        dogBuilder.setName("Dog");
        dogBuilder.setFlyable(false);
        dogBuilder.setSpeed(new SecureRandom().nextInt(60));
        Animal dog = dogBuilder.build();
        System.out.println(dog.getSpeed());

        Builder falconBuilder = new Builder();
        falconBuilder.setName("Falcon");
        falconBuilder.setFlyable(true);
        falconBuilder.setSpeed(new SecureRandom().nextInt(50));
        Animal falcon = falconBuilder.build();
        System.out.println(falcon.getSpeed());

        List <Animal> totalAnimal = new ArrayList<>();
        totalAnimal.add(tiger);
        totalAnimal.add(horse);
        totalAnimal.add(dog);
        totalAnimal.add(falcon);

        Animal max = getMaxSpeedAnimal(totalAnimal);
        System.out.println("Winner is " + max.getName() + " with speed: " + max.getSpeed());
    }

    public static Animal getMaxSpeedAnimal(List<Animal> animalList) {
        Animal max = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).isFlyable()) {
                animalList.remove(i);
           } else {
                if (max.getSpeed() > animalList.get(i).getSpeed()) {
                    max = max;
                } else {
                    max = animalList.get(i);
                }
            }
        }
        return max;
    }
}
