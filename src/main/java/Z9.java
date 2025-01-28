//Сделано
public class Z9 {
    public static void main(String[] args) {
        int[] arguments = {1, 2, 3, 4, 5};
        String x1 = "";
        String x2 = "";

        for (int i = 0; i < arguments.length; i++) {
            x1 += String.valueOf(arguments[i]);
        }
        for (int i = arguments.length - 1; i >= 0; i--) {
            x2 += String.valueOf(arguments[i]);
        }
        System.out.println(x1 + "\n"  + x2);
    }
}
