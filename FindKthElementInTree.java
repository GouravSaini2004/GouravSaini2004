import java.util.*;


public class FindKthElementInTree{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

        Node(int data){
           this.data = data;
        }
    }
    static int ans =0;
    static int count =0;

    public static void inOrder(Node root, int k){
        if(root==null) return;

        inOrder(root.left,k);
        count++;
        if(count==k){
            ans = root.data;
            return;

        }
        inOrder(root.right,k);
    }

    public static int kthElement(Node root, int k){
        inOrder(root,k);
        return ans;
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        //balanced binary search tree is required
        System.out.println(kthElement(root,3));
    }
}