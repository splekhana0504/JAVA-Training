package Day10;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="The Classroom";
        String s2="School Master";
        //replaceAll removes all the white space,tab space and newline character from a string
        s1=s1.toLowerCase().replaceAll("\\s","");
        s2=s2.toLowerCase().replaceAll("\\s","");
        //toCharArray converts entire string to an array
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        //sort the character array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
