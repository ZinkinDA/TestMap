package ru.zinkin.project2.model;

import ru.zinkin.project2.abstracts.People;

public class Man extends People {

    public Man(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.printf("%s : ЗАКРОЙ ПАСТЬ ЖЕНЩИНА!\n",super.getName());
    }
}
