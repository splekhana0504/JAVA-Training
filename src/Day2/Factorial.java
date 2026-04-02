package Day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*int i=n;
        int fact=1;
        for(i=1;i<=n;i++){
            fact*=i;
            //fact=fact*i;
        }
        System.out.println(fact);*/

        /*int count=0;  //countDigits
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);*/

        //reverse
        int temp=n;
        int rev=0;
        while(n>0){
            rev= rev * 10 + n % 10;
            n=n/10;
        }
        System.out.println(rev);

        if(temp==rev){  // palindrome
            System.out.println("It is palindrome");
        } else{
            System.out.println("It is not palindrome");
        }
    }
}
