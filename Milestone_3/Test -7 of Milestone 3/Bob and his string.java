import java.util.Scanner;

public class Main {
	public static int MAX_CHAR = 256;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(solve(str));
		}
	}

	public static int solve(String str) {
		int n = str.length();
		int res = -1;
		int[] firstInd = new int[MAX_CHAR];

		for (int i = 0; i < MAX_CHAR; i++)
			firstInd[i] = -1;

		for (int i = 0; i < n; i++) {
			int first_ind = firstInd[str.charAt(i)];
			if (first_ind == -1)
				firstInd[str.charAt(i)] = i;
			else
				res = Math.max(res, Math.abs(i - first_ind - 1));
		}

		return res;
	}
}