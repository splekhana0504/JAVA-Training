package Day8;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int []arr={64,25,18,12,22,11};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
