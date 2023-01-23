import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static boolean checkMaxHeap(int[] arr) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr)
			priorityQueue.add(i);
		for (int i : arr)
			if (i != priorityQueue.poll())
				return false;
		return true;
	}
}