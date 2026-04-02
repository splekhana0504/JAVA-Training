package Day9;

import java.util.*; //Include all

public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashset=new HashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> linkedhashset=new LinkedHashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> tree=new TreeSet<>(Arrays.asList(30,10,50,20,40));

        System.out.println("Hashset(Unordered Set):"+hashset);
        System.out.println("LinkedSet(Ordered Set):"+linkedhashset);
        System.out.println("TreeSet(sorted Set):"+tree);
    }
}