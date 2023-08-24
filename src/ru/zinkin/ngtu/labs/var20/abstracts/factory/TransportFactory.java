package ru.zinkin.ngtu.labs.var20.abstracts.factory;

import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransport;
import ru.zinkin.ngtu.labs.var20.model.transport.BusTransport;
import ru.zinkin.ngtu.labs.var20.model.enums.Statements;


public class TransportFactory implements AbstractFactory<PublicTransport[]>{
    @Override
    public PublicTransport[] getData() {
        return new PublicTransport[]{
                new BusTransport("i224fx","Алексей",null,null,null, Statements.going_forward)
        };
    }
}
