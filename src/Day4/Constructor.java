package Day4;

public class Constructor {
    String Name;
    Constructor(){
        //this("MS Dhoni"); //Invoking parametrized to default
        System.out.println("Default constructor gets called");
    }
    Constructor(String Name){
        this(); //Involve Default to parametrized
        this.Name=Name;
    }
    void display(){
        System.out.println(Name);
    }

    public static void main(String[] args) {
        //Constructor c1=new Constructor("Captain America");
        Constructor c1=new Constructor();
        c1.display();
    }
}
