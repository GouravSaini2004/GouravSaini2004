import java.util.*;

public class MaximumPathSumTree{
    static int max = Integer.MIN_VALUE;
    static class Node{
    int data;
    Node left = null;
    Node right = null;

        Node(int data){
          this.data = data;
        }
    }

    public static int helper(Node root){
        if(root==null) return 0;

        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        
        max = Math.max(max,(root.data+left+right));

        return root.data+Math.max(left,right);

    }

    public static int MaxPathSum(Node root){
        helper(root);
        return max;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(20);
        System.out.println(MaxPathSum(root));
    }
}