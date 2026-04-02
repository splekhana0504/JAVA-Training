package Day5;
interface Animal{
    void sound();
    default void aquatic(){
        System.out.println("Live in water");
    }//abstract method(No body)
}
class cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        cat c=new cat();
        c.sound();
        c.aquatic();
    }
}
