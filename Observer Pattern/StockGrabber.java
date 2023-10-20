import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }
    
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver){

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " has been deleted");

        observers.remove(observerIndex);
    }

    public void notifyObserver(){

        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setApplePrice(double newApplePrice){
        this.aaplPrice = newApplePrice;
        notifyObserver();
    }
    public void setGooglePrice(double newGooglePrice){
        this.googPrice = newGooglePrice;
        notifyObserver();
    }

}