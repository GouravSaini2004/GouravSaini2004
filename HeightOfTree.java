import java.util.*;

// class Node{
//     int data;
//     Node left = null;
//     Node right = null;

//     Node(int data){
//         this.data = data;
//     }
// }

public class HeightOfTree{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

    public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(height(root));
    }
}