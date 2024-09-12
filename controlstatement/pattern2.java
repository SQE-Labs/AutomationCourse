package controlstatement;

public class pattern2 {

	public static void main(String[] args) {
		int n = 6; // Number of rows for the top half (excluding the middle row)

		// Top half of the diamond (including the middle row)
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Bottom half of the diamond
		for (int i = n - 1; i >= 1; i--) {
			// Print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
