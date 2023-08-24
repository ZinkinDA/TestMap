package ru.zinkin.project1.model;

import ru.zinkin.project1.abstracts.Birds;

public class Bird extends Birds {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }

    @Override
    public void move() {
        System.out.println("Птица идет");
    }

    @Override
    public void sound() {
        System.out.println("Птица чирикает");
    }
}
