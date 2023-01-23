import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;
public class Solution {
	public static String getPathBF(int adjMatrix[][], boolean visited[], Queue<Integer> q, int a, int b ) {
		
		if(q.peek()==null)return null;
		for(int i=0; i<adjMatrix.length; i++) {
			if(adjMatrix[q.peek()][i]==1 && !visited[i]) {
				q.add(i);
				visited[i]=true;
			}
		}
		q.poll();
		return null;
	}
	
	public static void getPathBF(int adjMatrix[][], int a, int b) {
		Queue<Integer> q= new LinkedList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		ArrayList<Integer> arrList=new ArrayList<>();
		boolean visited[]=new boolean[adjMatrix.length];
		map.put(a, -1);
		q.add(a);
		visited[a]=true;
		while(!q.isEmpty()) {
			if(q.peek()==b) {
				int i=q.peek();
				while(i !=- 1) {
					arrList.add(i);
					i=map.get(i);
				}
				for(int j: arrList)System.out.print(j+" ");
				return;
			}
			for(int i=0; i<visited.length;i++) {
				if(adjMatrix[q.peek()][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
					map.put(i, q.peek());
					
				}
			}
			q.poll();
		}
		
	}
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		 Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		if(v==0)return;
		int adjMatrix[][]=new int [v][v];
		int n=adjMatrix.length;
		for(int i=0; i<e ;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjMatrix[v1][v2]=1;
			adjMatrix[v2][v1]=1;
			
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<0 || a>=adjMatrix.length || b<0 || b>=adjMatrix.length) {
			return;
		}
		getPathBF(adjMatrix, a, b);
	}
}