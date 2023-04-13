package Behavioral.Observer.Subscriber;

import Behavioral.Observer.Publisher.IStockObservable;

public class MobileAlertObserver implements NotificationObserver {
    private String userName;
    private IStockObservable observable;

    public MobileAlertObserver(String userName,IStockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("send message to " + userName);
    }
    
}
