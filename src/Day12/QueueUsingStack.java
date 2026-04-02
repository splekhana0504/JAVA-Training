package Day12;
import java.util.Stack;
class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println("Peek:"+q.peek());
        System.out.println("Pop:"+q.pop());
        System.out.println("Is Empty:"+q.empty());
    }

}
