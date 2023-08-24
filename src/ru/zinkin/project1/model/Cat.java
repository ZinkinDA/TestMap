package ru.zinkin.project1.model;

import ru.zinkin.project1.abstracts.Animals;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Кошка бежит!");
    }

    @Override
    public void sound() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Люблю кошек!");
    }
}
