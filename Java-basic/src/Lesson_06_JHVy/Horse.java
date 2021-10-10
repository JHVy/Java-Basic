package Lesson_06_JHVy;

import java.security.SecureRandom;

public class Horse extends Animal{
    static {
        defaultName = "Horse";
        maxSpeed = 75;
    }

    @Override
    public int setSpeed() {
        int speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

    public static String getDefaultName(){
        if(defaultName ==null){
            return "Horse";
        }
        return defaultName;
    }
}
