public class EmailPriceAlert implements MarketObserver{
    private double threshold;
    public EmailPriceAlert(double threshold){
        this.threshold=threshold;
    }
    @Override
    public void onPriceChange(String symbol, double newPrice){
        if(symbol.equals("ETH") && newPrice>threshold){
            System.out.println("[Email Price Alert] Sending Email...");
        }
    }
}