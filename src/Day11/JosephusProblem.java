package Day11;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class JosephusProblem {
    static Node head=null;
    public void circularLL(int n){
        if(n<=0)return;
        head=new Node(1);
        Node temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head; //make it circular list
    }
    public int josephus(int k){
        System.out.println();
        if(head==null ||head.next==null)return -1;
        Node prev=null;
        Node curr=head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                prev=curr;
                curr=curr.next;
            }
            System.out.println("Eliminated:"+curr.data);
            prev.next=curr.next;
            curr=prev.next; //handling over the gun to next after shooting
        }
        head=curr;
        return curr.data;
    }
    void display(int n){
        Node temp=head;
        int count=0;
        while(temp!=null && count<n){
            System.out.print(temp.data+" ->");
            temp=temp.next;
            count++;
        }
        System.out.print("Back to head");
    }
    public static void main(String[] args) {
        JosephusProblem cll=new JosephusProblem();
        cll.circularLL(7);
        cll.display(7);
        int survivor=cll.josephus(2);
        System.out.println("Thala for a reason:"+survivor);
    }
}
