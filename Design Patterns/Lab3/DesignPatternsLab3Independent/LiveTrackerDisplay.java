public class LiveTrackerDisplay implements MarketObserver{
    @Override
    public void onPriceChange(String symbol, double newPrice){
        System.out.println("[Live Tracker Display]: "+"Symbol is: "+symbol+ " Price is: "+newPrice);
    }
}