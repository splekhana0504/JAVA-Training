package Day8;
//performed on sorted array->Divide and conquer technique
// Best-> O(1)  worst->(log n) Avg-> O(log n)
//space->O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,12,14,16,18};
        int target=7;
        int low=0;
        int high=arr.length-1;
        int index=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]<target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(index!=1){
            System.out.println("Element "+target+" found at "+index);
        }
        else{
            System.out.println("Target not found");
        }
    }
}
