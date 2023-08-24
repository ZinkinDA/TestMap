package ru.zinkin.ngtu.labs.var20.abstracts.factory;

import ru.zinkin.ngtu.labs.var20.abstracts.PublicTransportStop;
import ru.zinkin.ngtu.labs.var20.model.stop.BusTransportStop;
import ru.zinkin.ngtu.labs.var20.model.stop.ElectricTrainTransportStop;

public class TransportStopFactory implements AbstractFactory<PublicTransportStop[]>{

    @Override
    public PublicTransportStop[] getData() {
        PublicTransportStop[] pts = new PublicTransportStop[getBusTransportStop().length + getElectricTransportStop().length];
        int i = 0;
        for (PublicTransportStop el:getBusTransportStop()) {
            pts[i] = el;
            i++;
        }
        i = 0;
        for(PublicTransportStop el: getElectricTransportStop()){
            pts[i] = el;
            i++;
        }
        return pts;
    }

    public PublicTransportStop[] getBusTransportStop(){
        return new BusTransportStop[]{
                new BusTransportStop("Поселок Сортировочный.",new double[]{ 56.294747, 43.871970 }),
                new BusTransportStop("Улица Долгополова",new double[]{1,1}),
                new BusTransportStop("Станция Сортировочная",new double[]{1,1}),
                new BusTransportStop("Улица движенцев",new double[]{1,1}),
                new BusTransportStop("Рынок Сортировка",new double[]{1,1}),
                new BusTransportStop("Улица Ухтомского",new double[]{1,1}),
                new BusTransportStop("Школа 181",new double[]{1,1}),
                new BusTransportStop("Улица Красных Зорь",new double[]{1,1}),
                new BusTransportStop("Детский сад",new double[]{1,1}),
        };
    }

    public PublicTransportStop[] getElectricTransportStop(){
        return new ElectricTrainTransportStop[]{
                new ElectricTrainTransportStop("Поселок Сортировочный.",new double[]{ 56.294747, 43.871970 }),
                new ElectricTrainTransportStop("Школа 181",new double[]{1,1})
        };
    }
}
