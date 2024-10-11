import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("xyz_1234",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);
        iphoneStockObservable.setStockCount(-110);
        iphoneStockObservable.setStockCount(10);
    }
}