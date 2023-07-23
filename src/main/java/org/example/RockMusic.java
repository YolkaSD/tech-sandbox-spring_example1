package org.example;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization: " + this);
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction: " + this);
    }

    @Override
    public String toString() {
        return "Rock music";
    }
}
