public class solution {


	public static void subsets(int input[], int index, String set) {
		if(input.length==index) {
			System.out.println(set);
			return;
		}
		subsets(input, index+1, set+input[index]+" ");
		subsets(input, index+1, set);
	}

	public static void printSubsets(int input[]) {
		
		subsets(input,0,"");
			// Write your code here

	}
}
