package ru.zinkin.project3.printer;

import ru.zinkin.project3.model.abstracts.Document;

public class Printer {

    private static Printer printer;
    private Document[] report;

    private Printer() {
    }

    public static Printer getInstance() {
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }

    public void loadDocs(Document[] report){
        this.report = report;
    }

    public void print(){
        for (Document r:report) {
            System.out.println(r.getContent());
        }
    }
}
