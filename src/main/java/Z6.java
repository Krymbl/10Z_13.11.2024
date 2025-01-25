import java.util.Scanner;
import java.lang.Math;

public class Z6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите А");
		Double a = scanner.nextDouble();
		System.out.println("Введите B");
		Double b = scanner.nextDouble();
		System.out.println("Введите B");
		Double c = scanner.nextDouble();
		Double D = b*b - 4*a*c;
		if (D > 0) {
			System.out.println("X1 = " + ((-b + Math.sqrt(D) / (2*a))));
			System.out.println("X2 = " + ((-b - Math.sqrt(D) / (2*a))));
		} else if (D==0) {
			System.out.println("X1 = X2 = " + ((-b)/(2*a)));
		} else {
			System.out.println("Корней нет");
		}
	}
}