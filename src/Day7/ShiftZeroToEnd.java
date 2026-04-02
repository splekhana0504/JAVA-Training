package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}