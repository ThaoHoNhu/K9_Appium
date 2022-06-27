package lab_09;
import java.util.*;

public class TestSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        System.out.println(dog.getSpeed());
        System.out.println(horse.getSpeed());
        System.out.println(tiger.getSpeed());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);

        Animal maxAnimal = getMaxSpeedAnimal(animalList);
        System.out.println("Winner is " + maxAnimal.getClass().getSimpleName() + " with speed: " + maxAnimal.getSpeed());

    }

    public static Animal getMaxSpeedAnimal(List<Animal> animalList) {
        Animal maxAnimal = animalList.get(0);
        for (int i = 1; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > maxAnimal.getSpeed()) {
                maxAnimal = animalList.get(i);
            }
        }
        return maxAnimal;
    }
}
