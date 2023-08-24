package ru.zinkin.project1.abstracts;

import ru.zinkin.project1.abstracts.intrefaces.Movable;
import ru.zinkin.project1.abstracts.intrefaces.Soundable;

public abstract class Animals implements Movable, Soundable {

    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.printf("Животное с именем %s\n",name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
