import java.util.*;



public class SearchBinarySearchTree{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

    public static Node search(Node root, int val){
        if(root==null){
            return null;
        }
        if(root.data==val) return root;
        if(val<root.data){
            return search(root.left,val);
        }else{
            return search(root.right,val);
        }
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        //if value found in tree so print node address and if value not found so print null
        System.out.println("value find in tree at node : "+search(root,3));
    }
}