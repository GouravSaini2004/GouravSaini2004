import java.util.*;

public class DeletionInBST{

    static class Node{
    int data;
    Node left = null;
    Node right = null;

    Node(int data){
        this.data = data;
    }
}
    //to get minimum value of right sub array
    public static Node getMin(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    // balanced BST is required
    public static Node deleteNode(Node root, int key){
        //search the node
        Node parent = null;
        Node curr = root;
        while(curr.data!=key){
            parent = curr;
            if(key<curr.data) curr = curr.left;
            else curr = curr.right;
        }
        //incase key is not present in tree
        if(curr==null) return root;

        // case-1 ---> if node has no child
        if(curr.left==null && curr.right==null){
            if(curr==root){
                return null;
            }else{
                if(parent.left==curr){
                    parent.left=null;
                }else{
                    parent.right=null;
                }
            }
            return root;

            // case-2----> if node has only one node
        }else if(curr.left==null || curr.right==null){
            Node child;
            if(curr.left!=null){
                child = curr.left;
            }else{
                child = curr.right;
            }

            if(curr==root){
                root = child;
            }
            if(parent.left==curr){
                parent.left=child;
            }else{
                parent.right=child;
            }
            return root;
        }else{
            //case-3---> if node has two child
            Node min = getMin(curr.right);
            int minVal = min.data;
            deleteNode(root,minVal);
            curr.data = minVal;
        }
        return root;
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.right = new Node(20);
        root.right.right.left = new Node(17);
        System.out.println(deleteNode(root,15));
    }
}