package Day7;

public class MinimumElement {
    public static void main(String[] args) {
        int []arr = {7,45,10,18,8};
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
