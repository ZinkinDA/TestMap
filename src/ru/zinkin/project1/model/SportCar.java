package ru.zinkin.project1.model;

import ru.zinkin.project1.abstracts.Cars;

public class SportCar extends Cars {

    public SportCar(String model, String name) {
        super(model, name);
    }

    @Override
    public void move() {
        System.out.println("Едет очень быстро");
    }

    @Override
    public void sound() {
        System.out.println("Звучит грозно");
    }
}
