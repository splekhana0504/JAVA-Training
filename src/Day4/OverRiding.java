package Day4;  //polymorphism

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bus extends Vehicle{
    @Override
    void run(){
        System.out.println("Bus is running smoothly");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Bus b=new Bus();//with reference of parent class created the object of child class
        b.run();

        Vehicle v=new Vehicle();
        v.run();

        Bus b1=new Bus();
        b1.run();
    }
}
