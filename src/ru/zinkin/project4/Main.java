package ru.zinkin.project4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setName("name");
        Car car1 = car.clone();


        System.out.println(car.getName());
        System.out.println(car1.getName());

        System.out.println(car == car1);
    }
}
