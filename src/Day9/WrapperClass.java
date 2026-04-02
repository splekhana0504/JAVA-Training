package Day9;

public class WrapperClass {
    public static void main(String[] args) {
        //AutoBoxing: Primitive to Wrapper Object
        int a=5;
        Integer obj=a; //AutoBoxing
        System.out.println("AutoBoxing:"+obj);

        //Auto Unboxing: Wrapper object to primitive
        Integer b=10;
        int c=b;
        System.out.println("Auto Unboxing:"+c);

        //Wrapper class Methods
        Integer num=50;
        //CompareTo [Greater(-1),same(0) ,less(1)
        System.out.println(num.compareTo(70));

        //Equals->true    not equal->false
        System.out.println(num.equals(50));

        //Max
        System.out.println(Integer.max(10,20));

        //Min
        System.out.println(Integer.min(10,20));

        //parseInt -> string to integer
        System.out.println(Integer.parseInt("3000"));
        //num to string
        System.out.println(num.toString());
    }
}
