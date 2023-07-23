package org.example;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Money Trees";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization: " + this);
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction: " + this);
    }

    @Override
    public String toString() {
        return "Pop music";
    }
}
