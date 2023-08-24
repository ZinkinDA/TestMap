package ru.zinkin.project3.factory;

import ru.zinkin.project3.model.abstracts.Document;
import ru.zinkin.project3.model.Ref;
import ru.zinkin.project3.model.Report;

import java.time.LocalDate;

public class DocFactory {

    public static Document[] getReports(){
        return new Report[]{
                new Report("name","description", (short) 2023),
                new Report("name2","description2", (short) 2022),
                new Report("name3","description3", (short) 2021)
        };
    }
    public static Document[] getReference(){
        return new Ref[]{
                new Ref("description1","i22tos", LocalDate.of(2020,8,6)),
                new Ref("description2","i23tow",LocalDate.now()),
                new Ref("description3","i24toq",LocalDate.of(1999,6,14))
        };
    }

    public static Document[] getDocument() {
        return new Document[]{
                new Report("name4","description", (short) 2001),
                new Report("name5","description2", (short) 2002),
                new Report("name6","description3", (short) 2003),
                new Ref("description4","i22tos", LocalDate.of(2019,8,6)),
                new Ref("description5","i23tow",LocalDate.now()),
                new Ref("description6","i24toq",LocalDate.of(1998,11,14))
        };
    }

}
