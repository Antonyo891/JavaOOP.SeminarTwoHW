public interface ActorBehavior {
    public boolean isMakeOrder(); //сделал заказ
    public boolean isTakeOrder(); //получил заказ
    public void setMakeOrder();
    public void setTakeOrder();
}
