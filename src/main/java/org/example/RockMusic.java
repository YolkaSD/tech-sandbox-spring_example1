package org.example;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @Override
    public String toString() {
        return "Rock music";
    }
}
