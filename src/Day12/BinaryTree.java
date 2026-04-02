package Day12;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class BinaryTree {
    Node root;
    void preorder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void levelOrder(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.offer(curr.left);
            if(curr.right!=null)
                q.offer(curr.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        System.out.println("Preorder Traversal ->");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Inorder Traversal ->");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Postorder Traversal ->");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("Level Order Traversal ->");
        tree.levelOrder(tree.root);
    }
}