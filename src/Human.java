public class Human extends Actor {
    
    @Override
    public void setMakeOrder(){     // сделал заказ
        isMakeOrder();
        System.out.println("Человек " + getName() + " сделал заказ");
        super.isTakeOrder = false;
    } 

    @Override
    public void setTakeOrder(){     // получил заказ
        isTakeOrder();
        System.out.println("Человек " + getName() + " получил заказ");
    }   
    
    @Override
    public String getName(){
        return super.name;
    }    

    @Override
    protected void setName(String name){
        super.name = name;
    }
    
    public Human (String name){
        setName(name);
        super.isMakeOrder = false;
        super.isTakeOrder = false;
    }    
    @Override
    public boolean getIsMakeOrder(){
        return super.isMakeOrder;
    }

    @Override
    public boolean getIsTakeOrder(){
        return super.isTakeOrder;
    }

    @Override
    public String toString() {
        if (super.isMakeOrder) return "{" + super.name +
            " стоит в очереди }";
        else return "{" + super.name +
            " сделал покупки и ушел}";
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder = true;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder =true;
    }



}

