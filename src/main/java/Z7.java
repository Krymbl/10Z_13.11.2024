import java.util.Scanner;
//Сделано
public class Z7 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n");
		int n = scanner.nextInt();
		int num = 0;
		int k = 0;
		System.out.println("Введите n чисел");
		for (int i = 0; i < n; i++) {
			num = scanner.nextInt();
			if (IsRight(num)) {
				k++;
			}
		}
		if (k==3) {
			System.out.println("Существуют");
		} else {
			System.out.println("Не существуют");
		}
	}

	public static boolean IsRight (Integer x) {
		String[] s = ("" + x). split("");
		for (int i = 1; i < s.length; i++) {
			if (Integer.parseInt(s[i]) >= Integer.parseInt(s[i-1])) {
				return false;
			}
		}
		return true; 
	}
}