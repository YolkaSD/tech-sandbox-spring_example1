package org.example;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian";
    }

    @Override
    public String toString() {
        return "Classic music";
    }
}
