package Day7;
// case 1:Nullifying Reference
public class Test1 {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        System.out.println(t1);
        t1=null;
        System.out.println(t1);

        // case 2:Reassigning reference
        t1=new Test1();
        System.out.println(t1);
    }
}
