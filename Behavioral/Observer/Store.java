package Behavioral.Observer;

import Behavioral.Observer.Publisher.IStockObservable;
import Behavioral.Observer.Publisher.IphoneObservable;
import Behavioral.Observer.Subscriber.EmailAlertObserver;
import Behavioral.Observer.Subscriber.MobileAlertObserver;
import Behavioral.Observer.Subscriber.NotificationObserver;

public class Store {
    public static void main(String[] args) {
        IStockObservable observable = new IphoneObservable();
        
        NotificationObserver observer1 = new EmailAlertObserver("abc@email.com", observable);
        NotificationObserver observer2 = new MobileAlertObserver("xyz",observable);
        NotificationObserver observer3 = new EmailAlertObserver("pqr@email.com",observable);
        
        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);

        observable.setStockCount(0);

        observable.setStockCount(11);
    }
}
