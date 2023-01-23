import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solve(arr, 0, 12, "");
	}

	public static void solve(int[] arr, int s, int sum, String st) {
		if (sum == 0) {
			System.out.println(st);
			return;
		}
		if (s == arr.length) {
			return;
		}

		solve(arr, s + 1, sum - 1, st + arr[s] + " ");
		solve(arr, s + 1, sum, st);
	}
}