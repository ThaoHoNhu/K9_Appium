package lab_09;
import java.security.SecureRandom;

public abstract class Animal {
    String name;
    int speed;

    public Animal(int maxSpeed ) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public abstract int getSpeed();

}
