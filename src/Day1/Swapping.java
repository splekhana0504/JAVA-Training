package Day1;

public class Swapping {
    public static void main(String[] args) {
        int a=5,b=10;
        /*System.out.println("Before swapping " +a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);*/

        a=a+b; //without temp
        b=a-b;
        a=a-b;

        // without 3rd var and arithematic op using bitwise
        /*a=a^b;
        b=a^b;
        a=a^b;*/
        /*a=a*b; 4th method
        b=a/b;
        a=a/b;*/


        System.out.println("After swapping " +a+" "+b);
    }
}
