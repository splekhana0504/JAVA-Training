package Day3;

public class Sum {
    int Add(int a,int b){
        int add=a+b;
        return add;
    }

    public static void main(String[] args) {
        Sum ob=new Sum(); //Allocated the memory
        //int n=ob.Add(5,6); //Function call
        //System.out.println(n);
        System.out.println(ob.Add(5,6));
    }
}
