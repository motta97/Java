public class TradingBotAlpha implements MarketObserver{
    @Override
    public void onPriceChange(String symbol, double newPrice){
        if(symbol.equals("BTC") && newPrice<6000){
            System.out.println("[Trading Bot Alpha]: "+"Alpha Bot executing BUY order!");
        }
    }
}