package Day4;
class Human{
    void eat(){
        System.out.println("Humans eat PaniPuri");
    }
}
class MightyRaju extends Human{
    void saveWorld(){
        System.out.println("Saving the world");
    }
}
class Bhai extends Human{
    void earn(){
        System.out.println("Bhai works as a PaniPuri seller");
    }
}
public class hierarchy {
    public static void main(String[] args) {
        MightyRaju s=new MightyRaju();
        s.eat();
        s.saveWorld();

        Bhai b=new Bhai();
        b.earn();
        b.eat();
    }
}
