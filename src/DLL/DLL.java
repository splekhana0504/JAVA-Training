package DLL;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DLL {
    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void addAtPosition(int data, int pos) {
        if (pos <= 1) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 1;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            addLast(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void removeAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos <= 1) {
            removeFirst();
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < pos) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void display() {
        Node current = head;
        System.out.print("null <->");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addFirst(5);

        System.out.print("List after insertions: ");
        dll.display();

        dll.addAtPosition(15, 3);
        System.out.print("List after addAtPosition(15,3): ");
        dll.display();

        dll.removeAtPosition(2);
        System.out.print("List after removeAtPosition(2): ");
        dll.display();

        dll.removeFirst();
        System.out.print("List after removeFirst: ");
        dll.display();

        dll.removeLast();
        System.out.print("List after removeLast: ");
        dll.display();
    }
}