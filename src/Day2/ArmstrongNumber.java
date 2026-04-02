package Day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d*d*d;
            n/=10;
        }
        if(temp==sum){
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is not Armstrong");
        }
    }
}
