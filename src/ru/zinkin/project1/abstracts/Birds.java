package ru.zinkin.project1.abstracts;

import ru.zinkin.project1.abstracts.intrefaces.Flyable;

public abstract class Birds extends Animals implements Flyable {
    public Birds(String name) {
        super(name);
    }
}
