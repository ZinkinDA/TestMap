package ru.zinkin.project4;

import java.time.LocalDate;

public class Car implements Cloneable{
    private String model;
    private String name;
    private LocalDate published;

    public Car() {
    }

    public Car(String model, String name, LocalDate published) {
        this.model = model;
        this.name = name;
        this.published = published;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!model.equals(car.model)) return false;
        if (!name.equals(car.name)) return false;
        return published.equals(car.published);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + published.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", published=" + published +
                '}';
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
