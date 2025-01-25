import java.util.Scanner;
public class Z10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите кол-во строк");
		int n = scanner.nextInt();
		String[] s = new String[n];
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Введите строки");
		for (int i = 0; i < n; i++) {
			s[i] = scanner2.nextLine();
		}
		System.out.println("Введите подстроку");
		String s1 = scanner2.nextLine();
		for (int i = 0; i < s.length; i++) {
			if (s[i].toLowerCase().contains(s1.toLowerCase())) {
				System.out.println(i);
			}
		}
	}
}