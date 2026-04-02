package Day2;

import java.util.Scanner;
public class BasicCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the symbol");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/': System.out.println(a/b);break;
            case '%': System.out.println(a%b);break;
            default:  System.out.println("Invalid");
        }
    }
}
