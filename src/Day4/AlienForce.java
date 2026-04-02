package Day4;

class Ben10{
    void name(){
        System.out.println("Ben Tenyson");
    }
}
class Omitrix extends Ben10{
    void Omitrix(){
        System.out.println("Azmath created Omitrix");
    }
}
class HeatBlast extends Omitrix{
    void Alien(){
        System.out.println("Fires heat Strokes");
    }
}
public class AlienForce {
    public static void main(String[] args) {
        HeatBlast h=new HeatBlast();
        h.name();
        h.Omitrix();
        h.Alien();
    }
}
