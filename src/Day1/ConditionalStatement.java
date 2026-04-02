package Day1;

import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        /*if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }*/

        if(a>b){
            System.out.println("a is larger");
        }else{
            System.out.println("b is larger");
        }
    }
}
