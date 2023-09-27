

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract void setName(String name);
    abstract String getName();
    public abstract boolean getIsMakeOrder();
    public abstract boolean getIsTakeOrder();

    
}
