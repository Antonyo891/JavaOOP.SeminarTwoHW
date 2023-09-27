public class App {
    public static void main(String[] args) throws Exception {

        Human h1 = new Human("1");
        Human h2 = new Human("2");
        Human h3 = new Human("3");
        Human h4 = new Human("4");
        Human h5 = new Human("5");
        Market market = new Market();
        market.acceptToMarket(h1);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.update();
        market.acceptToMarket(h4);
        market.releaseFromMarket(market.Getactors());
        market.update();
        market.releaseFromMarket(market.Getactors());
        market.acceptToMarket(h5);
        market.update();
        market.update();
        market.releaseFromMarket(market.Getactors());
        market.releaseFromMarket(market.Getactors());
        market.update();
        market.releaseFromMarket(market.Getactors());
        
    }
}
