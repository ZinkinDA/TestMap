package ru.zinkin.ngtu.labs.var20.model.transport;

import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransport;
import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransportStop;
import ru.zinkin.ngtu.labs.var20.model.enums.Statements;

public class BusTransport extends PublicTransport {
    public BusTransport(String number, String driverName, PublicTransportStop[] route, Byte[] workload, PublicTransportStop currentTransportStop, Statements statement) {
        super(number, driverName, route, workload, currentTransportStop, statement);
    }

    @Override
    public void sound() {
        System.out.println("Звук автобуса");
    }
}
