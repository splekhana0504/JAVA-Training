package Day12;

import java.util.Queue;
import java.util.LinkedList;

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
    }
    public int pop() {
        return q.poll();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element:"+ stack.top());
        System.out.println("Pop element:"+stack.pop());
        System.out.println("Top element after:"+stack.pop());
    }
}
