package ru.zinkin.ngtu.labs.var20.service;

import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransport;
import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransportStop;
import ru.zinkin.ngtu.labs.var20.abstracts.factory.AbstractFactory;
import ru.zinkin.ngtu.labs.var20.abstracts.factory.TransportFactory;
import ru.zinkin.ngtu.labs.var20.abstracts.factory.TransportStopFactory;
import ru.zinkin.ngtu.labs.var20.service.abstracts.InitService;

import java.util.List;

public class InitServiceImpl implements InitService {

    private static InitServiceImpl initService = null;
    private AbstractFactory<PublicTransportStop[]> factoryStop;
    private AbstractFactory<PublicTransport[]> factoryTransport;

    private InitServiceImpl(AbstractFactory<PublicTransportStop[]> factoryStop, AbstractFactory<PublicTransport[]> factoryTransport) {
        this.factoryStop = factoryStop;
        this.factoryTransport = factoryTransport;
    }

    public static InitServiceImpl getInstance() {
        if(initService == null){
            initService = new InitServiceImpl(new TransportStopFactory(),new TransportFactory());
        }
        return initService;
    }

    @Override
    public PublicTransport[] getTransport() {
        return null;
    }


    private List<PublicTransport> getBus(){
        return null;
    }

    private List<PublicTransport> getElectricTransport(){
        return null;
    }

    private List<PublicTransport> getTramTransport(){
        return null;
    }
}
