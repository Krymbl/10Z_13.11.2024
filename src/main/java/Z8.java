public class Z8 {
	public static void main (String[] args){
		int n = 10;
		int mas[] = new int[n];
		int raz = 1;
		int v = 0;
		int chet = 1;
		for (int i = 0; i < n; i++) {
			mas[i] = raz;
			v += 4;
			chet *= -1;
			raz += chet*v;
			System.out.print(mas[i] + " ");

		}
	}
}

//сделано