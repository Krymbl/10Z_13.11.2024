import java.util.Scanner;

public class Z3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		int m = scanner.nextInt();
		for (int i = k+1; i < m; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}
}