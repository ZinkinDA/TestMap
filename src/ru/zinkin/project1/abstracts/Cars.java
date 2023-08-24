package ru.zinkin.project1.abstracts;

import ru.zinkin.project1.abstracts.intrefaces.Movable;
import ru.zinkin.project1.abstracts.intrefaces.Soundable;

public abstract class Cars implements Movable, Soundable {
    private String model;
    private String name;

    public Cars(String model, String name) {
        this.model = model;
        this.name = name;
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

    public void getInfo(){
        System.out.printf("Машина с пармаетрами : \n\t %s \n\t %s \n ",name,model);
    }
}
