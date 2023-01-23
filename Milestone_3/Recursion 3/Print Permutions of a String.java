public class solution {


	public static void permutationsHelper(String string, String set) {
		if (string.length() == 0) {
			System.out.println(set);
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			permutationsHelper(string.substring(0, i) + string.substring(i + 1), set + string.charAt(i));
		}
	}


	public static void permutations(String input){
		
		permutationsHelper(input, "");

	}
}
