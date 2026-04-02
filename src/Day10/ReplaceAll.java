package Day10;

import java.util.*;

public class ReplaceAll {
    public static void main(String[] args) {
        String text="abc123xyz456";
        String result=text.replaceAll("\\d","#");
        System.out.println(result);

        String text1="Hello Folks";
        String result1=text1.replaceAll("[aeiou]","@");
        System.out.println(result1);

        String text2="Hello@123_Iron Man <3000";
        String result2=text2.replaceAll("[^A-za-z0-9]","");
        System.out.println(result2);
    }
}
