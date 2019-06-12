package thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day5Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        printMultiples(n);
        scanner.close();
    }

    private static void printMultiples(int n) {
        // Loop IntStream 10 times
        //2 x 1 = 2
        //2 x 2 = 4
        IntStream.rangeClosed(1, 10).forEach(i -> {
            System.out.println(n + " x " + i + " = " + (n*i));
        });
    }
}
