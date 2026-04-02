package Day2;

import java.util.Scanner;
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.println("one"); break;
            case 2: System.out.println("Two"); break;
            default:
                System.out.println("Invalid");
        }
    }
}
