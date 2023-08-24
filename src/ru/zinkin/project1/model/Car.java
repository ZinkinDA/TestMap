package ru.zinkin.project1.model;

import ru.zinkin.project1.abstracts.Cars;

public class Car extends Cars {

    public Car(String model, String name) {
        super(model, name);
    }

    @Override
    public void move() {
        System.out.println("Машина едет!");
    }

    @Override
    public void sound() {
        System.out.println("Би-би-п");
    }

}
