import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    BinaryTreeNode<Integer> root;

    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int x){
        if (root==null) {
            
            return new BinaryTreeNode<>(x);
            //return root;
        }
        if(root.data<x) {
            root.right = insert(root.right,x);
        }
        if (root.data>=x){
            root.left = insert(root.left,x);
        }
        return root;
    }

    public void insert(int data) {
        //Implement the insert() function
        root = insert(root,data);
    }

    private static int findMinimum(BinaryTreeNode<Integer> root,int x){
        if (root==null) return x;
        if (root.data<x) {
            x = root.data;
        }
        return findMinimum(root.left,x);
    }

    private static BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int x){
        if (root==null) return null;
        if (root.data<x) root.right = delete(root.right,x);
        else if (root.data>x) root.left = delete(root.left,x);
        else {
            if (root.left==null && root.right==null) return null;
            else if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {
                
                
				// BinaryTreeNode<Integer> min = root.right;
				// while (min.left != null) {
				// 	min = min.left;
				// }
                root.data = findMinimum(root.right,Integer.MAX_VALUE);
                root.right = delete(root.right,root.data);
                return root;
            }
        }
        return root;
        
    }

    public void remove(int data) {
        //Implement the remove() function
        root = delete(root,data);
    }

    // private static void printLevelWise(Queue<BinaryTreeNode<Integer>> queue){
//         while (queue.peek()!=null) {
//             System.out.print(queue.peek().data + ":");
//             if (queue.peek().left != null) {
//                 System.out.print("L:" + queue.peek().left.data + ",");
//                 queue.add(queue.peek().left);
//             }
//             if (queue.peek().right != null) {
//                 queue.add(queue.peek().right);
//                 System.out.print("R:" + queue.peek().right.data);
//             }
//             System.out.println();
//             queue.poll();
//         }
//     }

//     private static void printLevelWise(BinaryTreeNode<Integer> root) {
//         //Your code goes here
//         if (root==null) return;
//         Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
//         queue.add(root);
//         printLevelWise(queue);

//     }

     public static void print(BinaryTreeNode<Integer> root){
        
        if(root == null){
            return;
        }
        
        
        
        System.out.print(root.data + ":");
        
        if(root.left!=null){
            
            System.out.print("L:" + root.left.data+",");
        }
        
        if(root.right!=null){
            
            System.out.print("R:" + root.right.data);
        }
         
        System.out.println();
        print(root.left);
        print(root.right);
        
    }
    public void printTree() {
        //Implement the printTree() function
        print(root);

    }

    private static boolean searchInBST(BinaryTreeNode<Integer> root,int data){
        if (root==null) return false;
        if (root.data==data) return true;
        if (root.data<data)return searchInBST(root.right,data);
        return searchInBST(root.left,data);
    }

    public boolean search(int data) {
        //Implement the search() function
        return searchInBST(root,data);
    }


}