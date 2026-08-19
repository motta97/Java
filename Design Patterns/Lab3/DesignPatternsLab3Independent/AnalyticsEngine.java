public class AnalyticsEngine implements MarketObserver{
    private int count=0;
    private double total=0;
    @Override
    public void onPriceChange(String symbol, double newPrice){
        count++;
        total+=newPrice;
        System.out.println("[Analytics Engine] Average observed price is: "+total/count);
    }
}