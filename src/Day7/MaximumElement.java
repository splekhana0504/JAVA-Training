package Day7;

public class MaximumElement {
    public static void main(String[] args) {
        int []arr={7,45,10,18,8};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
