package Day10;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> words=new ArrayList<>();
        for(int i=0;i<n;i++){
            words.add(sc.next());
        }
        Map<String,List<String>>mp=new HashMap<>();
        for(String w:words){
            char[] chars=w.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<String>());
            }
            mp.get(key).add(w);
        }
        System.out.println(mp);

        /*for(Map.Entry<String,List<String>>entry:mp.entrySet()){
            for(String word:entry.getValue()){
               System.out.println(words+" ");
            }
            System.out.println();
        }*/
    }
}