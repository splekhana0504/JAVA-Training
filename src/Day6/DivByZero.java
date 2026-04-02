package Day6;

import java.util.Scanner;

public class DivByZero {
    static void FetchElement(int n,int d)throws ArithmeticException { //it executes after try block
        if(d==0){
            throw new ArithmeticException("Zero divisible not possible");
        }else{
            System.out.println(n/d);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numerator:");
        int n=sc.nextInt();

        System.out.println("Enter Denominator:");
        int d=sc.nextInt();

        try{
            FetchElement(n,d);
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception "+e.getMessage());
        }finally {
            System.out.println("Program Executed");
        }
    }
}
