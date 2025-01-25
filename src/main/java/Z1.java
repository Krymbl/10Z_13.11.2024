import java.util.Scanner;

public class Z1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int h = 1; h <= n; h++) {
			for (int i = 0; i < n*2-h; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < 2*h-1; i++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int h = 1; h <= n; h++) {
			for (int g = 1; g <= 2; g++) {
				for (int i = 0; i < n-h; i++) {
					System.out.print(" ");
				}

				for (int i = 1; i <= 2*h-1; i++) {
					System.out.print("*");
				}

				if (g == 1) {
					for (int i = 0; i < n-h+1; i++) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}


		
	}
}