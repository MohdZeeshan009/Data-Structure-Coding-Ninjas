import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		// Write your code here
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			pq.add(input[i]);
		}
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0; i<k; i++) {
			arrayList.add(pq.poll());
			
		}
		return arrayList;

	}
}