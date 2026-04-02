package Day7;

public class RotateArray {
    public static void main(String[] args) {
        /*int[] arr={1,2,3,4,5};
        int n=arr.length; //to store length of an array
        int last=arr[n-1]; // to stare the last element in an array
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];//shifting by 1 index
        }
        arr[0]=last;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }*/

        //shift left
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; //to store length of an array
        int last = arr[0]; // to stare the last element in an array
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];//shifting by 1 index
        }
        arr[4] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}