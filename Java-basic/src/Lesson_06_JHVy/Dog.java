package Lesson_06_JHVy;

import java.security.SecureRandom;

public class Dog<maxSpeech> extends Animal{

    static {
        defaultName = "Dog";
        maxSpeed = 60;
    }

    @Override
    public int setSpeed() {
        int speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

    public static String getDefaultName(){
        if(defaultName ==null){
            return "Dog";
        }
        return defaultName;
    }
}
