package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization: " + this);
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction: " + this);
    }

    @Override
    public String toString() {
        return "Classic music";
    }
}
