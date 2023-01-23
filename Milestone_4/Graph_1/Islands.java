import java.util.*;
public class Solution {

	public static void numConnectedHelper(int edge[][], boolean[]visited, Queue<Integer> q) {

		if(q.peek()==null) {
			return ;
		}
		for(int i=0; i<edge.length; i++) {
			if(edge[q.peek()][i]==1 && !visited[i]) {
				visited[i]=true;
				q.add(i);
			}
		}
		q.poll();
		numConnectedHelper(edge, visited, q);
	}

	public static int numConnected(int[][] edges, int n) {
        
		boolean visited[]=new boolean[n];
		Queue<Integer> q=new LinkedList<>();
		int count =0;
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				count++;
				visited[i]=true;
				q.add(i);
				numConnectedHelper(edges, visited, q);
			}
		}
		return count;
	}


}