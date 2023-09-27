import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Human> listOfHumans = new ArrayList<>();
    private List<Human> actors = new ArrayList<>();
    
    public List<Human> Getactors(){
        return actors;
    }
    @Override
    public     void takeInQueue(Actor actor){ //стал в очередь
        listOfHumans.add((Human) actor);
        System.out.println(actor.getName() + " стал в очередь");
    }
    
    @Override
    public void takeOrders(){ // первый в очереди сделал заказ
        listOfHumans.get(0).setMakeOrder();
    }
    
    @Override
    public void giveOrders(){ // первый в очереди получил заказ
        listOfHumans.get(0).setTakeOrder();
    }
    
    @Override
    public void releaseFromQueue(){//ушел из очереди
        actors.add(listOfHumans.remove(0));
        System.out.println(actors.get(0).getName() + 
        " покинул очередь");
    }
    
    @Override
    public void acceptToMarket(Actor actor){//зашел в магазин, стал в очередь
        System.out.println(actor.getName() + "зашел в магазин");
        takeInQueue(actor);
    }
    
    @Override
    public void releaseFromMarket(List<Human> list){//ушел из очереди и из магазина
        System.out.println(list.remove(0).getName() + " ушел из магазина");
    }
    
    @Override
    public void update(){
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    }
