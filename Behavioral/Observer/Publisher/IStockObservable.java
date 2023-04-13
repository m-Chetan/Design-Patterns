package Behavioral.Observer.Publisher;

import Behavioral.Observer.Subscriber.NotificationObserver;

public interface IStockObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void notifySubscribers();

    void setStockCount(int stockCount);
    int getStockCount();
}
