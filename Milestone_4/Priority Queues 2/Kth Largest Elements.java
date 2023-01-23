import java.util.PriorityQueue;
public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
		for (int i=k; i<n;i++) {
			if (input[i] > pq.peek()) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		return pq.peek();
	}
}