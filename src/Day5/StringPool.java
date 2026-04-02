package Day5;

public class StringPool {
    public static void main(String[] args) {
        String s1="RCB";
        String s2="RCB";
        String s3=new String("RCB");
        String s4=new String("RCB");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4); //because address is different
        System.out.println(s3.equals(s4));// it compares only the value
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        //intern() -> method forces the string in heap to store in string pool
        String s5=s3.intern();
        System.out.println(s1==s5);
    }
}