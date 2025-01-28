import java.util.Scanner;
//Сделано
public class Z4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int x = 0; x <= 2*n; x++) {
			for (int y = 0; y <= 2*n; y++) {
				if (((x-n)*(x-n)) + ((y-n) * (y-n)) <= n*n) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}