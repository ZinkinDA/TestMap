package ru.zinkin.project2;

import ru.zinkin.project2.abstracts.People;
import ru.zinkin.project2.model.Man;
import ru.zinkin.project2.model.Woman;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<People> set = new HashSet<>(List.of( new Man("Александр"),new Woman("Людмила")));

        for (var el:set) {
            el.sound();
        }
    }
}
