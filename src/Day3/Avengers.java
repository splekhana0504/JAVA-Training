package Day3;

public class Avengers {
    String Name;//instance variable
    //constructor
    Avengers(String Name){ //local variable
        this.Name=Name; //this keyword
    }

    Avengers(){
        System.out.println("Default constructor called");
    }

    void display(){
        System.out.println("Tony Stark:"+Name);
    }

    public static void main(String[] args) {
        Avengers a1=new Avengers("Iron Man");
        Avengers a2=new Avengers();
        //System.out.println(a1);
        a1.display();
    }
}