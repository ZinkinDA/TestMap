package ru.zinkin.project3.model;

import ru.zinkin.project3.model.abstracts.Document;

import java.time.LocalDate;

public class Ref implements Document {

    private String description;
    private String number;
    private LocalDate date;

    public Ref() {
    }

    public Ref(String description, String number, LocalDate date) {
        this.description = description;
        this.number = number;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String getContent() {
        return String.join(" : ","Контент",toString());
    }

    @Override
    public String toString() {
        return "Ref{" +
                "description='" + description + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                '}';
    }
}
