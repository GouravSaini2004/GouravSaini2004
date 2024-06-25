import java.util.*;

public class treeImplemantation{

   static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
   }

   static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }

        Node node  = new Node(nodes[idx]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);

        return node;

    }
   }

   public static class Traversal{
    List<Integer> l = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    List<Integer> l3 = new ArrayList<>();
    public List<Integer> preOrder(Node root){
        if(root==null){
            return l;
        }
        l.add(root.data);
        preOrder(root.left);
        preOrder(root.right);

        return l;
    }

    public List<Integer> postOrder(Node root){
        if(root==null){
            return l;
        }
        postOrder(root.left);
        postOrder(root.right);
        l2.add(root.data);

        return l2;
    }

    public List<Integer> inOrder(Node root){
        if(root==null){
            return l;
        }
        inOrder(root.left);
        l3.add(root.data);
        inOrder(root.right);

        return l3;
    }
   }

   static class CountLeaf{
    public int countLeaf(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        return countLeaf(root.left)+countLeaf(root.right);
    }
   }


   public static void main(String[] args){
    int nodes[] = {1,2,3,-1,-1,7,-1,-1,8,-1,6,-1,-1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    System.out.println(root.data);
    Traversal tra = new Traversal();
    List<Integer> list1 = tra.preOrder(root);
    List<Integer> list2 = tra.postOrder(root);
    List<Integer> list3 = tra.inOrder(root);
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    CountLeaf count = new CountLeaf();
    System.out.println(count.countLeaf(root)+" leaf node present in tree:");
}
}

