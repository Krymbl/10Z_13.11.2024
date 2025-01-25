public class Z2 {
	public static double square(double num) {
		double t;
		double squaret = num / 2;
		do {
			t = squaret;
			squaret = (t + (num / t)) / 2;
		}
 			while ((t - squaret) != 0);
		return squaret;
	}

	public static void main(String[] args) {
		double num = 5;
		double itog = square(num);
		System.out.printf("%.6f", itog);
	}
}