import java.util.*;

public class TreeDepthFirstSearchQ{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

        Node(int data){
           this.data = data;
        }
    }

   public static ArrayList<Integer> levelOrder(Node root){
    ArrayList<Integer> ans = new ArrayList<>();
    if(root==null) return ans;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node n = q.remove();
        ans.add(n.data);
        if(n.left != null){
            q.add(n.left);
        }
        if(n.right != null){
            q.add(n.right);
        }
    }
    return ans;
   }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(7);
        System.out.println(levelOrder(root));
    }
}