package lab_09;
import java.util.*;
import java.security.SecureRandom;

public class Horse extends Animal {

    private static int HORSE_MAX_SPEED = 75;

    public Horse() {
        super(HORSE_MAX_SPEED);
    }

    @Override
    public int getSpeed(){
        return speed;
    }
}
