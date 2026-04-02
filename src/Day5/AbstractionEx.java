package Day5;

abstract class Appliance{
    //abstract method(without method body)
    abstract void turnOn();
    //Nonabstract(With method body)
    void plugIn(){
        System.out.println("Appliance is plug in");
    }
}
class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Fan is spinning");
    }
}
public class AbstractionEx {
    public static void main(String[] args) {
        Appliance a=new Fan();
        a.plugIn(); // Nonabstract meth of abstract class
        a.turnOn();
    }
}