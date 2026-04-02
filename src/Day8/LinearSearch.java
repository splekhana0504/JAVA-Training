package Day8;
//linear search is performed on both sorted and unsorted array
//Time-> O(n)  space-> O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int []arr={7,8,17,18,45,77};
        int target=17;
        boolean found=false;
        int index=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.println("Element "+target+ " found at index "+index);
        }
        else{
            System.out.println("Element "+target+" Not found");
        }
    }
}
