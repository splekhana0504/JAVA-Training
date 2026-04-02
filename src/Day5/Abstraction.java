package Day5;
abstract class Shape{
    abstract void draw(); //Abstract method without a method body
    void area(){ //Nonabstract method
        System.out.println("Area of a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape s=new Circle();//object of derived class wrt abstract
        s.draw();
        s.area();
    }
}
