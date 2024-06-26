import java.util.*;

// class Node{
//     int data;
//     Node left = null;
//     Node right = null;

//     Node(int data){
//         this.data = data;
//     }
// }

public class TreeDepthFirstSearchR{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}

   public static void level(Node root){
    int level =1;
    while(printLevel(root,level)){
        level++;
    }
   }

   public static boolean printLevel(Node root, int level){
    if(root==null) return false;
    if(level==1){
        System.out.println(root.data);
        return true;
        
    }
    boolean left = printLevel(root.left,level-1);
    boolean right = printLevel(root.right,level-1);

    return (left || right);
   }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        level(root);
    }
}