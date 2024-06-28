import java.util.*;

public class SymmenticTree{
    
    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

    public static boolean check(Node left, Node right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.data != right.data) return false;

        return check(left.left,right.right) && check(left.right,right.left);
    }

    public static boolean isSymmentic(Node root){
        return check(root, root);
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        boolean flag = isSymmentic(root);
        System.out.println(flag);
    }
}