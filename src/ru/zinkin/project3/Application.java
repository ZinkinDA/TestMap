package ru.zinkin.project3;

import ru.zinkin.project3.factory.DocFactory;
import ru.zinkin.project3.model.abstracts.Document;
import ru.zinkin.project3.printer.Printer;

public class Application {
    public static void main(String[] args) {

        /*
            Инициализация принтера.
         */
        Printer printer = Printer.getInstance();
        /*
            Создание документов.
         */
        Document[] report = DocFactory.getReports();
        Document[] ref = DocFactory.getReference();
        Document[] documents = DocFactory.getDocument();

        /*
            Печать документов.
        */
        printer.loadDocs(report);
        printer.print();

        System.out.println("/*******************************************/");

        printer.loadDocs(ref);
        printer.print();

        System.out.println("/*******************************************/");

        printer.loadDocs(documents);
        printer.print();


    }
}
