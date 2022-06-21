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

        AnimalRacing max = getMaxSpeedAnimal(animalList);
        System.out.println("Winner is " + max.getClass().getSimpleName() + " with speed: " + max.getSpeed());

    }

    public static AnimalRacing getMaxSpeedAnimal(List<AnimalRacing> animalList) {
        AnimalRacing max = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (max.getSpeed() > animalList.get(i).getSpeed()) {
                max = max;
            } else {
                max = animalList.get(i);
            }
        }
        return max;
    }
}

