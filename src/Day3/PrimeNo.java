package Day3;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        /*int count=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("It is prime");
            }
            else{
                System.out.println("It is not prime");
            }*/

        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(isPrime?"prime":"composite");
    }
}
