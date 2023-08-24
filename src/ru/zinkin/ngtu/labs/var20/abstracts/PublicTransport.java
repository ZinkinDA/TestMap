package ru.zinkin.ngtu.labs.var20.abstracts;

import ru.zinkin.ngtu.labs.var20.abstracts.interfaces.Movable;
import ru.zinkin.ngtu.labs.var20.abstracts.interfaces.Soundable;
import ru.zinkin.ngtu.labs.var20.model.enums.Statements;

import java.util.Arrays;
import java.util.List;

public abstract class PublicTransport implements Movable, Soundable {
    private String number;
    private String driverName;
    private PublicTransportStop[] route;
    private Byte[] workload;
    private PublicTransportStop currentTransportStop;
    private Statements statement;

    public PublicTransport(String number, String driverName, PublicTransportStop[] route, Byte[] workload, PublicTransportStop currentTransportStop, Statements statement) {
        this.number = number;
        this.driverName = driverName;
        this.route = route;
        this.workload = workload;
        this.currentTransportStop = currentTransportStop;
        this.statement = statement;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public PublicTransportStop[] getRoute() {
        return route;
    }

    public void setRoute(PublicTransportStop[] route) {
        this.route = route;
    }

    public Byte[] getWorkload() {
        return workload;
    }

    public void setWorkload(Byte[] workload) {
        this.workload = workload;
    }

    public Statements getStatement() {
        return statement;
    }

    public void setStatement(Statements statement) {
        this.statement = statement;
    }

    public PublicTransportStop getCurrentTransportStop() {
        return currentTransportStop;
    }

    public void setCurrentTransportStop(PublicTransportStop currentTransportStop) {
        this.currentTransportStop = currentTransportStop;
    }
}
