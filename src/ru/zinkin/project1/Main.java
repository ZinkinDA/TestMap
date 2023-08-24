package ru.zinkin.project1;

import ru.zinkin.project1.abstracts.Animals;
import ru.zinkin.project1.abstracts.Birds;
import ru.zinkin.project1.abstracts.Cars;
import ru.zinkin.project1.abstracts.intrefaces.Movable;
import ru.zinkin.project1.model.Bird;
import ru.zinkin.project1.model.Car;
import ru.zinkin.project1.model.Cat;
import ru.zinkin.project1.model.SportCar;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Cat");
        Cars[] car = new Cars[]{new SportCar("i234fs","mercedes"),new Car("iir211","LADA")};
        Birds bird = new Bird("Хуица");

//        Soundable[] soundables = new Soundable[]{
//                car,cat
//        };
//
//        for (Soundable el:soundables) {
//            el.sound();
//        }

        Movable[] movable = new Movable[2 + car.length];
        movable[0] = cat;
        movable[1] = bird;
        for(int i = 0;i < car.length;i++){
            movable[i + 2] = car[i];
        }


        for (var el:movable){
            el.move();
        }
    }
}
