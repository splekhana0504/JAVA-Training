package Day7;

import java.util.Scanner;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n=sc.nextInt();
        int []arr=new int[n]; //array declaration
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        //prefix sum logic
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        /*for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); -> normal
        }*/
        //System.out.println(arr); -> it prints address not array
        System.out.println(Arrays.toString(arr)); //after import java.util.Arrays;
    }
}
