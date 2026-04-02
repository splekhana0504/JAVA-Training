package Day4;
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}
class student extends Person{
    student(String name){
        super(name);
    }
    void study(){
        System.out.println(name+" is studying");
    }
}
class professor extends Person{
    professor(String name){
        super(name);
    }
    void teach(){
        System.out.println(name+ " is teaching");
    }
}
public class CollegeLife {
    public static void main(String[] args) {
        student s=new student("Ram");
        s.walk();
        s.study();

        professor p=new professor("GC");
        p.teach();
    }
}
