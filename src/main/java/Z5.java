import java.util.Scanner;
//Сделано
public class Z5 {
	public static void main(String[] args) {
		System.out.println("Введите x");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble(); //Значение х для которого вычиссляем sin(x)
		double s = 1e-9; //Требуемая точность
		double result = 0; //результат вычислений
		double t = x; //текущий член ряда
		int n = 1; //номер текущего члена ряда

		while (Math.abs(t) > s) {
			result += t;
			t *= -x * x / ((2 * n) * (2 * n +1));
			n++;
		}
		System.out.println(result);
	}
}