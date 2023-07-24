package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
    }
}
