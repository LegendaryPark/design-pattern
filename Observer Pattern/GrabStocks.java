public class GrabStocks{
    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setApplePrice(677.00);
        stockGrabber.setGooglePrice(567.00);


    }
}