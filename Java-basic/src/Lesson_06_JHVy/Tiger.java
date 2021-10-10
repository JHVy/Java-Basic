package Lesson_06_JHVy;

import java.security.SecureRandom;

public class Tiger extends Animal {
    static {
        defaultName = "Tiger";
        maxSpeed = 100;
    }

    @Override
    public int setSpeed() {
        int speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

    public static String getDefaultName(){
        if(defaultName ==null){
            return "Tiger";
        }
        return defaultName;
    }

}
