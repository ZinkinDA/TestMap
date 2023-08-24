package ru.zinkin.project;

import ru.zinkin.project.model.People;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, People> map = new HashMap<>();
        People[] people = new People[]{new People("1","1","1", (byte) 1),new People("2","2","2", (byte) 2)};
        map.put(people[0].hashCode(),people[0]);

        System.out.println(map.get(people[0].hashCode()).getAge());

        map.put(people[1].hashCode(),people[1]);

        System.out.println(map.get(people[0].hashCode()).getAge());
    }
}
