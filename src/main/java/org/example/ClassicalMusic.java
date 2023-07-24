package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
