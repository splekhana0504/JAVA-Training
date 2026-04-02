package Day5;

public class StringManipulation {
    public static void main(String[] args) {
        String str1="Rocky";
        String str2="Rocky";
        String str3="Adheera";
        //using equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //using compareTo
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }
}
