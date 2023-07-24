package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization: " + this);
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction: " + this);
    }

    @Override
    public String toString() {
        return "Classic music";
    }
}
