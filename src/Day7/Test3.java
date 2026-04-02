package Day7;
//case 5: island of isolation
public class Test3 {
    Test3 ref;// Instance variable
    public static void main(String[] args) {
        Test3 t1=new Test3();
        Test3 t2=new Test3();
        System.out.println(t1+" "+t2);

        t1.ref=t2;
        t2.ref=t1;
        System.out.println(t1.ref);
        System.out.println(t2.ref);
        t1=null;
        t2=null;
    }
}