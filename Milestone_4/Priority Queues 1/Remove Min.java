import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException{
		// Complete this function
		// Throw the exception PriorityQueueException if queue is empty
	 if (isEmpty()) throw new PriorityQueueException();
		int removed=heap.get(0);
		int ans=removed;

		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);

		int parentIdx=0;
		int leftChildIdx=2*parentIdx+1;
		int rightChildIdx=2*parentIdx+2;

		while(leftChildIdx<heap.size()) {
			int minIdx=parentIdx;
			if(heap.get(leftChildIdx)< heap.get(minIdx)) {
				minIdx=leftChildIdx;
			}
			if (rightChildIdx<heap.size() && heap.get(rightChildIdx)<heap.get(minIdx)) {
				minIdx=rightChildIdx;
			}
			if(minIdx==parentIdx) {
				break;
			}
			int temp=heap.get(minIdx);
			heap.set(minIdx, heap.get(parentIdx));
			heap.set(parentIdx, temp);
			parentIdx=minIdx;
			leftChildIdx=2*parentIdx+1;
			rightChildIdx=2*parentIdx+2;
		}
		return ans;
	}
}

class PriorityQueueException extends Exception {

}