package Day9;
import java.util.ArrayList;
import java.util.List;

public class IntegerListOperations {
    public static void main(String[] args) {
        List <Integer> list=new ArrayList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>7){  //shifting mechanism
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

       /* list.remove(Integer.valueOf(8));
        list.remove(Integer.valueOf(9));
        list.remove(Integer.valueOf(10));
        System.out.println(list);*/
    }
}