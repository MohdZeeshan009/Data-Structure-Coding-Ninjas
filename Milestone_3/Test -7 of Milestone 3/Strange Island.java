import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		Character ans[][] = new Character[row + 2][col + 2];

		for (int i = 0; i < row + 2; i++) {
			for (int j = 0; j < col + 2; j++) {
				ans[i][j] = '.';
			}
		}

		for (int i = 1; i < row + 1; i++) {
			String sn = s.next();
			for (int j = 1; j < col + 1; j++) {
				char c = sn.charAt(j - 1);
				ans[i][j] = c;
			}
		}

		for (int i = 1; i < row + 1; i++) {
			for (int j = 1; j < col + 1; j++) {
				int count = 0;
				if (ans[i][j] == 'X') {
					if (ans[i + 1][j] == '.') {
						count++;
					}
					if (ans[i][j + 1] == '.') {
						count++;
					}
					if (ans[i - 1][j] == '.') {
						count++;
					}
					if (ans[i][j - 1] == '.') {
						count++;
					}
					if (count >= 3) {
						ans[i][j] = '1';
					}
				}
			}
		}

		int rowstart = Integer.MAX_VALUE;
		int rowend = Integer.MIN_VALUE;
		int colstart = Integer.MAX_VALUE;
		int colend = Integer.MIN_VALUE;

		for (int i = 1; i < row + 1; i++) {

			for (int j = 1; j < col + 1; j++) {

				if (ans[i][j] == '1') {
					ans[i][j] = '.';
				}

				if (ans[i][j] == 'X') {
					if (i < rowstart) {
						rowstart = i;
					}

					if (i > rowend) {
						rowend = i;
					}
					if (j < colstart) {
						colstart = j;
					}
					if (j > colend) {
						colend = j;
					}
				}
			}
		}

		for (int i = rowstart; i <= rowend; i++) {
			for (int j = colstart; j <= colend; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
}