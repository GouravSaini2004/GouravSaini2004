import java.util.*;



public class ValidBinryTree{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

    public static boolean check(Node root, int min, int max){
        if(root==null) return true;
        if(root.data<=min || root.data>=max) return false;

        return check(root.left,min,root.data) && check(root.right,root.data,max);
    }

    public static boolean isValid(Node root){
         return check(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        System.out.println(isValid(root));
    }
}