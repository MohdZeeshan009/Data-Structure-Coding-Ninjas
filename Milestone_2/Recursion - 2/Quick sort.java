/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void qkSort(int arr[], int low, int high) {
		if(low<high) {
			int pi= partition(arr,low, high);
		
		qkSort(arr, low, pi-1);
		qkSort(arr, pi+1, high);
		}
		
	}
	public static int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
//				swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
	public static void quickSort(int[] input) {
		
		int n=input.length;
		qkSort(input, 0, n-1);
	}
	
}