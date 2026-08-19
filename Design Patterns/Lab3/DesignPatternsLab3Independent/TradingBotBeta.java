public class TradingBotBeta implements MarketObserver{
    @Override
    public void onPriceChange(String symbol, double newPrice){
        if(newPrice > 7000){
            System.out.println("[Trading Bot Beta]]: "+"Beta Bot executing SELL order!");
        }
    }
}