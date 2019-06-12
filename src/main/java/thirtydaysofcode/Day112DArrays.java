package thirtydaysofcode;

import java.util.Scanner;

public class Day112DArrays {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(maxHourGlass(arr));
        scanner.close();
    }

    private static int maxHourGlass(int[][] arr) {
        // store max value
        // loop through element & get sum
        int max = 0;

        // ADD ANOTHER FLAG INSTEAD OF ASSUMING MAX WILL BE POSITIVE NOS ONLY
        boolean maxSet = false;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr[0].length-2; j++) {
                int sum = getHourSum(arr,i,j);
                if ((!maxSet) || sum > max) {
                    max = sum;
                    maxSet = true;
                }
            }
        }
        return max;
    }

    private static int getHourSum(int[][] arr, int i, int j) {
        return arr[i][j] + arr[i][j+1] + arr[i][j+2]
        + arr[i+1][j+1]
        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
    }
}
