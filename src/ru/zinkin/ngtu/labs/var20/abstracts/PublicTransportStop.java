package ru.zinkin.ngtu.labs.var20.abstracts;

import java.util.Arrays;

public abstract class PublicTransportStop {

    private String name;

    private double[] coordinates;

    public PublicTransportStop(String name, double[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return String.format("Остановка общественного транспорта :\n\t name : %s \n\t coordinates : %f , %f",name,coordinates[0],coordinates[1]);
    }
}
