public class Main{
    public static void main(String[] args) {
        CryptoMarket cryptoMarket=new CryptoMarket();
        MarketObserver tradingBotAlpha = new TradingBotAlpha();
        MarketObserver tradingBotBeta = new TradingBotBeta();
        MarketObserver liveTrackerDisplay = new LiveTrackerDisplay();
        MarketObserver analyticsEngine = new AnalyticsEngine();
        MarketObserver emailPriceAlert = new EmailPriceAlert(5000);

        cryptoMarket.registerObserver(emailPriceAlert);
        cryptoMarket.registerObserver(analyticsEngine);
        cryptoMarket.registerObserver(tradingBotAlpha);
        cryptoMarket.registerObserver(tradingBotBeta);
        cryptoMarket.registerObserver(liveTrackerDisplay);

        cryptoMarket.setPrice( 59500.0, "BTC");
        cryptoMarket.setPrice( 72000.0, "BTC");
        System.out.println("Removing Trading Bot Alpha...");
        cryptoMarket.removeObserver(tradingBotAlpha);
        cryptoMarket.setPrice( 4999.0, "BTC");


        cryptoMarket.setPrice( 9000.0, "Gold");
        cryptoMarket.setPrice( 15000.0, "BTC");
        cryptoMarket.setPrice( 2000.0, "Silver");

        cryptoMarket.setPrice(60000, "ETH");

        
    }
}