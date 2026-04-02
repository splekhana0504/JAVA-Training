package Day8;
import java.util.Arrays;
//Time-> O(n^2) space->O(1)
public class SelectionSort {
    public static void selectionSort(int []arr){
        for(int i=0;i< arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={77,18,45,17,10,63};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
