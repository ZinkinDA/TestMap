package ru.zinkin.project3.model;

import ru.zinkin.project3.model.abstracts.Document;

public class Report implements Document {
    private String name;
    private String description;
    private Short value;

    public Report() {
    }

    public Report(String name, String description, Short value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getValue() {
        return value;
    }

    public void setValue(Short value) {
        this.value = value;
    }

    public String getContent(){
        return String.join(" : " ,"Контент" , toString());
    }

    @Override
    public String toString() {
        return "Report{ name='" + name + "', description='" + description + '\'' +", value=" + value + '}';
    }
}
