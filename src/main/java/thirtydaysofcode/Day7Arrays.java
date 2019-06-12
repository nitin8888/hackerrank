package thirtydaysofcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day7Arrays {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        printArray(arr);

        scanner.close();
    }

    private static void printArray(int[] arr) {
        // 2 3 4 1
        // IntStream reverse values
        // first reverse array using tmp value
        // join using space
        String reverseArray = IntStream.range(0, arr.length).mapToObj(i -> String.valueOf(arr[arr.length -i-1])).collect(Collectors.joining(" "));
        System.out.println(reverseArray);
    }
}
