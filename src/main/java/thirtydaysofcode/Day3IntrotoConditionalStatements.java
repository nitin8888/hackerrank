package thirtydaysofcode;

import java.util.Scanner;

public class Day3IntrotoConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(getText(N));
        scanner.close();
    }

    private static String getText(int n) {
        boolean isEven = n % 2 == 0;
        if (!isEven || (n >= 6 && n <= 20)) {
            return "Weird";
        } else if ((n >= 2 && n <= 5) || n > 20) {
            return "Not Weird";
        }
        return null;
    }
}
