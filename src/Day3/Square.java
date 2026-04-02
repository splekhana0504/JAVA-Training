package Day3;

import java.util.Scanner;

public class Square {
    int Sq(int a){
        int Sq=a*a;
        return Sq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        Square ob=new Square();
        System.out.println(ob.Sq(n));
    }
}
