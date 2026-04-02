package Day13;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BST {
    static Node root=null;
    Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data< root.data){
            root.left=insert(root.left,data);
        }else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    boolean search(Node root,int data){
        if(root==null)return false;
        if(root.data==data)return true;
        if(data<root.data){
            return search(root.left,data);
        }
        else
            return search(root.right,data);
    }
    int countNodes(Node root){
        if(root==null)return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    int countLeaf(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        return countLeaf(root.left)+countLeaf(root.right);
    }
    int height(Node root){
        if(root==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    /*int diameter(Node root){
        if(root==null)return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);

        return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter,rightDiameter));
    }*/
    int diameter(Node root){
        if(root==null)return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return leftHeight+rightHeight+1;
    }
    Node delete(Node root,int data){
        if(root==null)return null;
        if(data<root.data){
            root.left=delete(root.left,data);
        }
        else if(data>root.data){
            root.right=delete(root.right,data);
        }
        else{
            //case 1:No child
            if(root.left==null && root.right==null){
                return null;
            }
            //Case 2:one child
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3: two children
            else{
                Node successor=findMin(root.right);
                root.data=successor.data;
                root.right=delete(root.right,successor.data);
            }
        }
        return root;
    }
    Node findMin(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        BST tree=new BST();
        root=tree.insert(root,50);
        tree.insert(root,30);
        tree.insert(root,70);
        tree.insert(root,20);
        tree.insert(root,40);
        tree.insert(root,60);
        tree.insert(root,80);
        tree.insert(root,15);

        System.out.println("Inorder Traversal(Sorted format):");
        tree.inorder(root);

        System.out.println();
        System.out.println("Search 60:"+tree.search(root,60));

        System.out.println("Total Number of Nodes:"+tree.countNodes(tree.root));
        System.out.println("Total leaf nodes:"+tree.countLeaf(tree.root));

        System.out.println("Height:"+tree.height(tree.root));
        System.out.println("Diameter:"+tree.diameter(tree.root));

        root=tree.delete(root,40);
        tree.inorder(root);
    }
}