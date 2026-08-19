public interface MarketObserver{
    void onPriceChange(String symbol, double newPrice);
}