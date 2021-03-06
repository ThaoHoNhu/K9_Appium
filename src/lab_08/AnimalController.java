package lab_08;

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
        totalAnimal.add(falcon);
        totalAnimal.add(dog);

        Animal maxAnimal = getMaxSpeedAnimal(totalAnimal);
        System.out.println("Winner is " + maxAnimal.getName() + " with speed: " + maxAnimal.getSpeed());
    }

    public static Animal getMaxSpeedAnimal(List<Animal> animalList) {
        Animal maxAnimal = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).isFlyable()) {
                System.out.println(animalList.get(i).getName());
           } else {
                if (animalList.get(i).getSpeed() > maxAnimal.getSpeed()) {
                    maxAnimal = animalList.get(i);
                }
            }
        }
        return maxAnimal;
    }
}
