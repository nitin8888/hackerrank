package thirtydaysofcode;


import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // Get StdIn input
        // Pass the values to process
        Scanner scan = new Scanner(System.in);
        int nosOfRows = Integer.parseInt(scan.nextLine());
        IntStream.range(0,nosOfRows).forEach(i -> {
            printOddEven(scan.nextLine());
        });
        scan.close();
    }

    private static void printOddEven(String text) {
        char[] chars = text.toCharArray();
        String oddChar = getChars(chars, (i) -> (i % 2) == 0);
        String evenChar = getChars(chars, (i) -> (i % 2) != 0);
        System.out.println(String.join(" ", oddChar, evenChar));
    }

    private static String getChars(char[] chars, IntPredicate pred) {
        return IntStream.range(0, chars.length).filter(pred).mapToObj(i -> String.valueOf(chars[i])).collect(Collectors.joining());
    }
}
