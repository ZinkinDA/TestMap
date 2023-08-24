package ru.zinkin.project2.abstracts;

import ru.zinkin.project2.abstracts.interfaces.MOZG;
import ru.zinkin.project2.abstracts.interfaces.Movable;
import ru.zinkin.project2.abstracts.interfaces.Soundbal;

public abstract class People implements Movable, Soundbal, MOZG {

    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.printf("Человек %s передвигается\n",name);
    }

    @Override
    public void mozguet() {
        System.out.printf("Человек %s мозгует\n",name);
    }
}
