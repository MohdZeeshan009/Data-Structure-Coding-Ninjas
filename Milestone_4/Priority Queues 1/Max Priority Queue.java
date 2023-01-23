import java.util.ArrayList;
public class PQ {

	ArrayList<Integer>heap;

	public PQ(){
		this.heap=new ArrayList<>();
	}

	// Complete this class
	boolean isEmpty() {
		if(getSize()==0){
			return true;
		}
		return false;
	}

	int getSize() {
		return heap.size();
			}

	int getMax() {
		if(getSize()==0) return Integer.MIN_VALUE;

		return heap.get(0);
		// Implement the getMax() function here
	}

	void insert(int element) {
		heap.add(element);
		int childIdx=heap.size()-1;
		int parentIdx= (childIdx-1)/2;

		while(parentIdx>=0 && heap.get(parentIdx)<heap.get(childIdx)){
			int temp=heap.get(parentIdx);
			heap.set(parentIdx, heap.get(childIdx));
			heap.set(childIdx, temp);
			childIdx=parentIdx;
			parentIdx=(childIdx-1)/2;
		}

		// Implement the insert() function here
	}

	int removeMax() {

		if (getSize() == 0)
			return Integer.MIN_VALUE;
		int removedElement = heap.get(0);
		int last = heap.get(heap.size() - 1);
		heap.set(0, last);
		heap.remove(heap.size() - 1);
		int parentIndex = 0, childIndex1 = 1, childIndex2 = 2;
		while (childIndex2 < getSize()
				&& (heap.get(parentIndex) < heap.get(childIndex1) || heap.get(parentIndex) < heap.get(childIndex2))) {
			int maxIndex;
			if (heap.get(childIndex1) > heap.get(childIndex2))
				maxIndex = childIndex1;
			else
				maxIndex = childIndex2;
			int temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(maxIndex));
			heap.set(maxIndex, temp);
			parentIndex = maxIndex;
			childIndex1 = parentIndex * 2 + 1;
			childIndex2 = childIndex1 + 1;
		}
		return removedElement;
		// Implement the removeMax() function here
	}
}