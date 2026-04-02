package Day7;
// case 3:Object Created inside a method-locally defined
public class Test2 {
    static void display(){
        Test2 t1=new Test2();
        System.out.println(t1); //it won't work outside method
    }
    //System.out.println(t1);
    public static void main(String[] args) {
        Test2 t=new Test2();
        System.out.println(t);
        t.display();

        // case 4: Anonymous Object -> do not have object reference
        new Test2();
    }
}
