package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName = userName;
        this.observable =  observable;
    }

    @Override
    public void update(){
        sendMsg(userName, "Product is in stock");
    }

    private void sendMsg(String userName, String msg) {
        System.out.println("Message  sent to: "+userName);
    }
}
