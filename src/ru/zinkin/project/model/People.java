package ru.zinkin.project.model;

import java.util.Objects;
public class People {

    private String id;
    private String name;
    private String surname;
    private Byte age;

    public People(String id, String name, String surname, Byte age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return id.equals(people.id) && name.equals(people.name) && surname.equals(people.surname) && age.equals(people.age);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
