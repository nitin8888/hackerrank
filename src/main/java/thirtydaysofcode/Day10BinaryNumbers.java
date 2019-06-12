package thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day10BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(maxConsecutiveNos(n));
        scanner.close();
    }

    private static int maxConsecutiveNos(int nos) {
        int max = 0;
        int nosOf1 = 0;
        while (nos > 0) {
            nosOf1 = nos%2==1 ? (nosOf1+1) : 0;

            nos = nos/2;
            if (nosOf1 > max) {
                max = nosOf1;
            }
        }
        return max;
    }

    /*

    private static int maxConsecutiveNos(int nos) {
        // Convert to binary
//        String binaryString = Integer.toBinaryString(nos);
        // count 1
        return countConsecutive(nos);
    }

    private static int maxConsecutiveNos(int nos) {
        // Convert to binary
        String binaryString = toBinary(nos);
//        String binaryString = Integer.toBinaryString(nos);
        // count 1
        return countConsecutive1(binaryString);
    }

    private static String toBinary(int nos) {
        // Keep on dividing by 2 until 0 i.e. while nos > 0
        // store remainder
        // return reverse array
        List<String> binaryChar = new ArrayList<>();
        while (nos > 0) {
            binaryChar.add(String.valueOf(nos%2));
            nos = nos/2;
        }
        Collections.reverse(binaryChar);
        return String.join("", binaryChar);
    }

    private static int countConsecutive1(String binaryString) {
        // store max
        // keep on counting in loop
        char[] chars = binaryString.toCharArray();
        int max = 0;
        int nosOf1 = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                nosOf1++;
            } else {
                nosOf1 = 0;
            }
            if (nosOf1 > max) {
                max = nosOf1;
            }
        }
        return max;
    }*/
}
