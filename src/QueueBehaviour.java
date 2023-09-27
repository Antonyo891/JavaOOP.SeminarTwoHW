public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders(); //сделал заказ
    void giveOrders(); // получил заказ
    void releaseFromQueue(); //ушел из очереди
}
