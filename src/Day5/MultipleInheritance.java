package Day5;

import Day2.BasicCal;

interface TomHolland{
    void boyFriend();
}
interface Zendaya{
    void girlFriend();
}
class Marvel implements TomHolland,Zendaya{
    @Override
    public void boyFriend(){
        System.out.println("BF GF");
    }
    @Override
    public void girlFriend(){
        System.out.println("Got married");
    }
}
//Hybrid inheritance
class Hulk extends Marvel{
    public void green(){
        System.out.println("Big Man");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Marvel m=new Marvel();
        m.boyFriend();
        m.girlFriend();
        Hulk h=new Hulk();
        h.green();
    }
}
