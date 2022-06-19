package lab_07_2;

public class TestSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        System.out.println(tiger.getSpeed());
        System.out.println(horse.getSpeed());
        System.out.println(dog.getSpeed());

        if (tiger.getSpeed() > horse.getSpeed() && tiger.getSpeed() > dog.getSpeed()) {
            System.out.println("Winner is " + Tiger.class.getSimpleName() + " with speed: " + tiger.getSpeed());
        }
        if (horse.getSpeed() > tiger.getSpeed() && horse.getSpeed() > dog.getSpeed()) {
            System.out.println("Winner is " + Horse.class.getSimpleName() + " with speed: " + horse.getSpeed());
        }
        if (dog.getSpeed() > tiger.getSpeed() && dog.getSpeed() > horse.getSpeed()) {
            System.out.println("Winner is " + Dog.class.getSimpleName() + " with speed: " + dog.getSpeed());
        }
    }
}
