package ru.zinkin.project2.model;

import ru.zinkin.project2.abstracts.People;

public class Woman extends People {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.printf("%s : Я ЖЕНЩИНА ИМЕЙТЕ СОВЕСТЬ!\n",super.getName());
    }
}
