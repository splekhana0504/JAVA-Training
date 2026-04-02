package Day7;

public class Difference {
    public static void main(String[] args) {
        int []nums={7,8,18,45,77,17};
        //assume the 1st no as max and min
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i< nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Difference:"+(max-min));
    }
}
