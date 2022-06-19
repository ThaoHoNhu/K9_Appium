package lab_07_2;

import java.util.*;
import java.security.SecureRandom;


public class Animal {
    private String name;
    private int speed;

    public Animal(int maxSpeed ) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
