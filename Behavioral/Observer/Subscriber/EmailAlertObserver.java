package Behavioral.Observer.Subscriber;

import Behavioral.Observer.Publisher.IStockObservable;

public class EmailAlertObserver implements NotificationObserver{
    private String email;
    private IStockObservable observable;

    public EmailAlertObserver(String email,IStockObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Send message to " + email);
        
    }
    
}
