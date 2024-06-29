import java.util.*;



public class InsertionBinarySearchTree{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

    public static Node insertionNode(Node root, int val){
        if(root==null){
            Node node = new Node(val);
            return node;
        }
        if(val<root.data){
            root.left = insertionNode(root.left,val);
        }else{
            root.right = insertionNode(root.right,val);
        }

        return root;
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        System.out.println(insertionNode(root,5).data);
    }
}