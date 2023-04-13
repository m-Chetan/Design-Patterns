package Behavioral.Observer.Publisher;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Observer.Subscriber.NotificationObserver;

public class IphoneObservable implements IStockObservable{

    List<NotificationObserver> subscriberList = new ArrayList<>();

    int stockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        subscriberList.add(observer);
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer: subscriberList){
            observer.update();
        }
    }

    @Override
    public void remove(NotificationObserver observer) {
        subscriberList.remove(observer);
        
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }
    
    
}
