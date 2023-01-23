import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Solution {

	public static void isConnectedHelper(int [][] adjMatrix,int currVertex, boolean visited[]){		
		visited[currVertex]=true;
		
		for(int i=0; i<adjMatrix.length;i++) {
			if(adjMatrix[currVertex][i]==1 && !visited[i]) {
				isConnectedHelper(adjMatrix, i, visited);
			}
		}
		
	}
	public static boolean isConnectedBFS(int [][] adjMatrix){
		boolean visited[]=new boolean [adjMatrix.length];
		isConnectedHelper(adjMatrix, 0, visited);
		for(boolean b: visited ) if(!b)return false;
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		 Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		if(v==0) {
			System.out.println(true);
			return;
		}
		int[][] adjMatrix=new int[v][v];
		for(int i=0; i<e; i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjMatrix[v1][v2]=1;
			adjMatrix[v2][v1]=1;
			
		}
		System.out.println(isConnectedBFS(adjMatrix));

	}

}