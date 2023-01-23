public class Solution {
	public static void heapify(int[] arr, int i, int n) {
		int parentIndex = i;
		int childIndex1 = parentIndex * 2 + 1, childIndex2 = childIndex1 + 1;
		while (childIndex1 < n) {
			int minIndex = parentIndex;
			if (arr[childIndex1] < arr[minIndex]) {
				minIndex = childIndex1;
			}
			if (childIndex2 < n && arr[childIndex2] < arr[minIndex]) {
				minIndex = childIndex2;
			}
			if (parentIndex == minIndex)
				return;
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			childIndex1 = parentIndex * 2 + 1;
			childIndex2 = childIndex1 + 1;
		}
	}

	public static void inplaceHeapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }


    }
}