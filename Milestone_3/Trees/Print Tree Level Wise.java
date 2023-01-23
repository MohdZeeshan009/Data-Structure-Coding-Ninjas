import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void printLevelWise(TreeNode<Integer> root){
        if (root==null) return;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            if (queue.peek()==null){
                System.out.println();
                queue.add(queue.poll());
                if (queue.peek()==null) return;
                continue;
            }
            System.out.print(queue.peek().data+" ");
            queue.addAll(queue.peek().children);
            queue.poll();
        }
    }
}