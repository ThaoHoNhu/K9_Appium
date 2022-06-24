package lab_07_2;

import java.util.*;

public class TestSpeed {

    public static void main(String[] args) {
        AnimalRacing dog = new Dog();
        AnimalRacing horse = new Horse();
        AnimalRacing tiger = new Tiger();

        System.out.println(tiger.getSpeed());
        System.out.println(horse.getSpeed());
        System.out.println(dog.getSpeed());

        List<AnimalRacing> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);

        AnimalRacing maxAnimal = getMaxSpeedAnimal(animalList);
        System.out.println("Winner is " + maxAnimal.getClass().getSimpleName() + " with speed: " + maxAnimal.getSpeed());

    }

    public static AnimalRacing getMaxSpeedAnimal(List<AnimalRacing> animalList) {
        AnimalRacing maxAnimal = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > maxAnimal.getSpeed()) {
                maxAnimal = animalList.get(i);
            }
        }
        return maxAnimal;
    }
}

