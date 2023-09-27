import java.util.List;

public interface MarketBehaviour {
public void acceptToMarket(Actor actor);//зашел в магазин, стал в очередь
public void releaseFromMarket(List<Human> actors);//ушел из очереди и из магазина
public void update();
}
